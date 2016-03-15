package sample.Adapters;

import sample.Shapes.Point;
import sample.Shapes.Rectangle;

public class RectangleAdapter extends ShapeAdapter {

    protected Point otherPoint = new Point();

    @Override
    public void manageOtherPoint(Point point) {
        otherPoint = point;
    }


    @Override
    public void setFirstPoint(Point point) {
        otherPoint = point;
        super.setFirstPoint(point);
    }

    @Override
    public Point[] getPoints() {
        return new Point[]{point, otherPoint};
    }


    @Override
    protected void createShape() {
        double side = Math.abs(point.getX() - otherPoint.getX());
        double otherSide = Math.abs(point.getY() - otherPoint.getY());
        drawable = new Rectangle(Point.getTopLeft(point, otherPoint, side, otherSide), side, otherSide);
    }
}
