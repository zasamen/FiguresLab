package sample.Drawers;

import sample.Figures.Line;
import sample.Figures.Shape;
import sample.Point;

public class LineDraw extends ShapeDraw {

    protected Point point;
    protected Point otherPoint;

    public LineDraw(Point point) {
        this.point = point;
        otherPoint = point;
    }

    public LineDraw(Point point, Point otherPoint) {
        this.point = point;
        this.otherPoint = otherPoint;
    }

    @Override
    public Shape getShape() {
        return new Line(point, otherPoint);
    }
}
