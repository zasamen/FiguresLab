package sample.Adapters;

import sample.Shapes.Point;
import sample.Shapes.Rectangle;
import sample.Shapes.Shape;

public class RectangleAdapter extends ShapeAdapter {

    protected Point otherPoint;

    public RectangleAdapter(Point point) {
        this.point = this.otherPoint = point;
    }

    public RectangleAdapter(Point point, Point point2) {
        this.point = point;
        this.otherPoint = point2;
    }

    public RectangleAdapter(RectangleAdapter rectangleAdapter, Point point) {
        this(rectangleAdapter.point, point);
    }

    @Override
    public Shape getShapeToDraw() {
        Point shapeHeightAndWidth = Point.diff(otherPoint, point);
        return new Rectangle(point, shapeHeightAndWidth.getX(), shapeHeightAndWidth.getY());
    }
}
