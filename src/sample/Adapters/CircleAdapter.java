package sample.Adapters;

import sample.Shapes.Circle;
import sample.Shapes.Point;

public class CircleAdapter extends EllipseAdapter {
    @Override
    protected void createShape() {
        Point radius = Point.diff(otherPoint, point);
        shape = new Circle(point, (radius.getX() < radius.getY()) ? radius.getX() : radius.getY());
    }
}