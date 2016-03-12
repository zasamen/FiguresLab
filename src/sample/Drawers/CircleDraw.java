package sample.Drawers;

import sample.Figures.Circle;
import sample.Figures.Shape;
import sample.Point;

public class CircleDraw extends ShapeDraw {

    protected Point otherPoint;

    public CircleDraw(Point point) {
        this.point = point;
    }

    public CircleDraw(Point point, Point point2) {
        this.point = point;
        this.otherPoint = point2;
    }


    @Override
    public Shape getShape() {
        Point radius = Point.diff(otherPoint, point);
        return new Circle(point, (radius.getX() < radius.getY()) ? radius.getX() : radius.getY());
    }
}
