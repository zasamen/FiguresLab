package sample.Adapters;

import sample.Shapes.Ellipse;
import sample.Shapes.Point;
import sample.Shapes.Shape;

public class EllipseAdapter extends ShapeAdapter {
    protected Point otherPoint;

    public EllipseAdapter(Point point) {
        this.otherPoint = this.point = point;
    }

    public EllipseAdapter(Point point, Point point2) {
        this.point = point;
        this.otherPoint = point2;
    }

    public EllipseAdapter(EllipseAdapter ellipseDrawer, Point point) {
        this(ellipseDrawer.point, point);
    }

    @Override
    public Shape getShapeToDraw() {
        Point radiuces = Point.diff(otherPoint, point);
        return new Ellipse(point, radiuces.getX(), radiuces.getY());
    }
}
