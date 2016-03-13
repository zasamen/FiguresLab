package sample.Adapters;

import sample.Shapes.Point;
import sample.Shapes.Polygon;
import sample.Shapes.Shape;

public class PolygonAdapter extends ShapeAdapter {
    protected Point[] points;

    public PolygonAdapter(Point... points) {
        this.points = new Point[points.length];
        System.arraycopy(points, 0, this.points, 0, points.length);
    }

    public PolygonAdapter(Point[] points, Point... newPoints) {
        this.points = new Point[points.length + newPoints.length];
        System.arraycopy(points, 0, this.points, 0, points.length);
        System.arraycopy(newPoints, 0, this.points, this.points.length, newPoints.length);
    }

    public PolygonAdapter(PolygonAdapter polygonAdapter, Point point) {
        this(polygonAdapter.points, point);
    }

    @Override
    public Shape getShapeToDraw() {
        return new Polygon(points);
    }
}
