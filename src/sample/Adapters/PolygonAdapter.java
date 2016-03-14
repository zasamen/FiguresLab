package sample.Adapters;

import sample.Shapes.Point;
import sample.Shapes.Polygon;

public class PolygonAdapter extends ShapeAdapter {
    protected Point[] points;

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
        createShape();
    }

    @Override
    public Point[] getPoints() {
        return points;
    }

    @Override
    protected void createShape() {
        shape = new Polygon(points);
    }
}
