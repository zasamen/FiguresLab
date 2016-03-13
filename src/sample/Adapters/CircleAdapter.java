package sample.Adapters;

import sample.Shapes.Circle;
import sample.Shapes.Point;
import sample.Shapes.Shape;

public class CircleAdapter extends EllipseAdapter {

    protected Point otherPoint;

    public CircleAdapter(Point point) {
        super(point);
    }

    public CircleAdapter(Point point, Point point2) {
        super(point, point2);
    }

    public CircleAdapter(CircleAdapter circleAdapter, Point point) {
        super(circleAdapter.point, point);
    }

    @Override
    public Shape getShapeToDraw() {
        Point radius = Point.diff(otherPoint, point);
        return new Circle(point, (radius.getX() < radius.getY()) ? radius.getX() : radius.getY());
    }
}
