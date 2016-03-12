package sample.Drawers;

import sample.Figures.Circle;
import sample.Figures.Shape;
import sample.Point;

public class CircleDraw extends EllipseDraw {

    protected Point otherPoint;

    public CircleDraw(Point point) {
        super(point);
    }

    public CircleDraw(Point point, Point point2) {
        super(point, point2);
    }

    public CircleDraw(CircleDraw circleDraw, Point point) {
        super(circleDraw.point, point);
    }

    @Override
    public Shape getShape() {
        Point radius = Point.diff(otherPoint, point);
        return new Circle(point, (radius.getX() < radius.getY()) ? radius.getX() : radius.getY());
    }
}
