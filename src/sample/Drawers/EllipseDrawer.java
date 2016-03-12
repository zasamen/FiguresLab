package sample.Drawers;

import sample.Figures.Ellipse;
import sample.Figures.Shape;
import sample.Point;

public class EllipseDrawer extends ShapeDraw {
    protected Point otherPoint;

    public EllipseDrawer(Point point) {
        this.otherPoint = point;
        this.point = point;
    }

    public EllipseDrawer(Point point, Point point2) {
        this.point = point;
        this.otherPoint = point2;
    }

    @Override
    public Shape getShape() {
        Point radiuces = Point.diff(otherPoint, point);
        return new Ellipse(point, radiuces.getX(), radiuces.getY());
    }
}
