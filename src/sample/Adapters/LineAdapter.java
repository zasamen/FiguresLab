package sample.Adapters;

import sample.Shapes.Line;
import sample.Shapes.Point;
import sample.Shapes.Shape;

public class LineAdapter extends ShapeAdapter {

    protected Point otherPoint;

    public LineAdapter(Point point) {
        this.point = otherPoint = point;
    }

    public LineAdapter(Point point, Point point2) {
        this.point = point;
        this.otherPoint = point2;
    }

    public LineAdapter(LineAdapter lineAdapter, Point point) {
        this(lineAdapter.point, point);
    }

    @Override
    public Shape getShapeToDraw() {
        return new Line(point, otherPoint);
    }
}
