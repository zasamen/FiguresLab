package sample.Adapters;

import sample.Shapes.Ellipse;
import sample.Shapes.Point;

public class EllipseAdapter extends ShapeAdapter {
    protected Point otherPoint = point;

    @Override
    public void setFirstPoint(Point point) {
        super.setFirstPoint(point);
    }

    @Override
    public void manageOtherPoint(Point point) {
        this.otherPoint = point;
    }

    @Override
    public Point[] getPoints() {
        return new Point[]{point, otherPoint};
    }

    @Override
    protected void createShape() {
        double diameter = Math.abs(point.getX() - otherPoint.getX());
        double otherDiameter = Math.abs(point.getY() - otherPoint.getY());
        drawable = new Ellipse(Point.getTopLeft(point, otherPoint, diameter, otherDiameter), diameter / 2, otherDiameter / 2);
    }
}
