package sample.Adapters;

import sample.Shapes.Ellipse;
import sample.Shapes.Point;

public class EllipseAdapter extends ShapeAdapter {
    protected Point otherPoint;

    @Override
    public void manageOtherPoint(Point point) {
        this.otherPoint = point;
        createShape();
    }

    @Override
    public Point[] getPoints() {
        return new Point[]{point, otherPoint};
    }

    @Override
    protected void createShape() {
        Point radios = Point.diff(otherPoint, point);
        shape = new Ellipse(point, radios.getX(), radios.getY());
    }
}
