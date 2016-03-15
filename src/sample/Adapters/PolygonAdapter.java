package sample.Adapters;

import sample.Shapes.Point;
import sample.Shapes.Polygon;

public class PolygonAdapter extends ShapeAdapter {
    protected Point[] points = new Point[]{new Point()};

    @Override
    public void setFirstPoint(Point point) {
        if (points != null) {
            points[0] = point;
        } else {
            points = new Point[]{point};
        }
    }

    @Override
    public void manageOtherPoint(Point point) {
        Point[] points = new Point[this.points.length + 1];
        System.arraycopy(this.points, 0, points, 0, this.points.length);
        this.points = points;
        this.points[points.length - 1] = point;
    }

    @Override
    public void resetLastPoint(Point point) {
        points[points.length - 1] = point;
    }

    @Override
    public void resetLastPoint() {
        points[points.length - 1] = points[0];
    }

    @Override
    protected void createShape() {
        drawable = new Polygon(points);
    }
}
