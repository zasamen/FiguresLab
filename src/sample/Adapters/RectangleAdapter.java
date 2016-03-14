package sample.Adapters;

import sample.Shapes.Point;
import sample.Shapes.Rectangle;

public class RectangleAdapter extends ShapeAdapter {

    protected Point otherPoint;

    @Override
    public void manageOtherPoint(Point point) {
        otherPoint = point;
        createShape();
    }

    @Override
    public Point[] getPoints() {
        return new Point[]{point, otherPoint};
    }


    @Override
    protected void createShape() {
        Point shapeHeightAndWidth = Point.diff(otherPoint, point);
        shape = new Rectangle(point, shapeHeightAndWidth.getX(), shapeHeightAndWidth.getY());
    }
}
