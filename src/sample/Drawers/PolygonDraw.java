package sample.Drawers;

import sample.Figures.Polygon;
import sample.Figures.Shape;
import sample.Point;

public class PolygonDraw extends ShapeDraw {
    protected Point[] points;

    public PolygonDraw(Point... points) {
        this.points = new Point[points.length];
        System.arraycopy(points, 0, this.points, 0, points.length);
    }

    public PolygonDraw(Point[] points, Point... newPoints) {
        this.points = new Point[points.length + newPoints.length];
        System.arraycopy(points, 0, this.points, 0, points.length);
        System.arraycopy(newPoints, 0, this.points, this.points.length, newPoints.length);
    }

    public PolygonDraw(PolygonDraw polygonDraw, Point point) {
        this(polygonDraw.points, point);
    }

    @Override
    public Shape getShape() {
        return new Polygon(points);
    }
}
