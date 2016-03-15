package sample.Adapters;

import sample.Shapes.Line;
import sample.Shapes.Point;

public class LineAdapter extends ShapeAdapter {

    protected Point otherPoint;

    @Override
    public void setFirstPoint(Point point) {
        otherPoint = point;
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
        drawable = new Line(point, otherPoint);
    }
}
