package sample.Adapters;

import sample.Shapes.Line;
import sample.Shapes.Point;

public class LineAdapter extends ShapeAdapter {

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
        shape = new Line(point, otherPoint);
    }
}
