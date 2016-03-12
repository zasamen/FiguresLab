package sample.Drawers;

import sample.Figures.Line;
import sample.Figures.Shape;
import sample.Point;

public class LineDraw extends ShapeDraw {

    protected Point otherPoint;

    public LineDraw(Point point) {
        this.point = otherPoint = point;
    }

    public LineDraw(Point point, Point point2) {
        this.point = point;
        this.otherPoint = point2;
    }

    public LineDraw(LineDraw lineDraw, Point point) {
        this(lineDraw.point, point);
    }

    @Override
    public Shape getShape() {
        return new Line(point, otherPoint);
    }
}
