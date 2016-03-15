package sample.Adapters;

import sample.Shapes.Drawable;
import sample.Shapes.Point;

public abstract class ShapeAdapter {
    protected Point point = new Point(0, 0);
    protected Drawable drawable;

    public void setFirstPoint(Point point) {
        this.point = point;
    }

    public abstract void manageOtherPoint(Point point);

    public abstract Point[] getPoints();

    public void resetLastPoint(Point point) {
    }

    public void resetLastPoint() {
    }

    public Drawable getDrawable() {
        createShape();
        return drawable;
    }

    protected abstract void createShape();

}
