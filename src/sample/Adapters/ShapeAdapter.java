package sample.Adapters;

import sample.Shapes.Point;
import sample.Shapes.Shape;

public abstract class ShapeAdapter {
    protected Point point;
    protected Shape shape;

    public ShapeAdapter() {

    }

    public Point getFirstPoint() {
        return point;
    }

    public void setFirstPoint(Point point) {
        this.point = point;
        createShape();
    }

    public abstract void manageOtherPoint(Point point);

    public abstract Point[] getPoints();

    public Shape getShape() {
        return shape;
    }

    protected abstract void createShape();

}
