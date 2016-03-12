package sample.Drawers;

import sample.Figures.Rectangle;
import sample.Figures.Shape;
import sample.Point;

public class RectangleDraw extends ShapeDraw {

    protected Point otherPoint;

    public RectangleDraw(Point point) {
        this.point = point;
        this.otherPoint = point;
    }

    public RectangleDraw(Point point, Point point2) {
        this.point = point;
        this.otherPoint = point2;
    }


    @Override
    public Shape getShape() {
        Point shapeHeightAndWidth = Point.diff(otherPoint, point);
        return new Rectangle(point, shapeHeightAndWidth.getX(), shapeHeightAndWidth.getY());
    }
}
