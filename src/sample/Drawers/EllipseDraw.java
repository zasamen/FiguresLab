package sample.Drawers;

import sample.Figures.Ellipse;
import sample.Figures.Shape;
import sample.Point;

public class EllipseDraw extends ShapeDraw {
    protected Point otherPoint;

    public EllipseDraw(Point point) {
        this.otherPoint = this.point = point;
    }

    public EllipseDraw(Point point, Point point2) {
        this.point = point;
        this.otherPoint = point2;
    }

    public EllipseDraw(EllipseDraw ellipseDrawer, Point point) {
        this(ellipseDrawer.point, point);
    }

    @Override
    public Shape getShape() {
        Point radiuces = Point.diff(otherPoint, point);
        return new Ellipse(point, radiuces.getX(), radiuces.getY());
    }
}
