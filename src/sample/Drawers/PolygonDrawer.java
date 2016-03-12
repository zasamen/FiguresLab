package sample.Drawers;

import sample.Figures.Polygon;
import sample.Figures.Shape;
import sample.Point;

public class PolygonDrawer extends ShapeDraw {
    protected Point[] points;

    public PolygonDrawer(Point... points) {
        this.points = new Point[points.length];
        System.arraycopy(points, 0, this.points, 0, points.length);
    }

    public PolygonDrawer(Point[] points, Point... newPoints) {
        this.points = new Point[points.length + newPoints.length];
        System.arraycopy(points, 0, this.points, 0, points.length);
        System.arraycopy(newPoints, 0, this.points, this.points.length, newPoints.length);
    }

    @Override
    public Shape getShape() {
        return new Polygon(points);
    }
}
