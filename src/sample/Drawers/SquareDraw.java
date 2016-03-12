package sample.Drawers;

import sample.Figures.Shape;
import sample.Figures.Square;
import sample.Point;

public class SquareDraw extends RectangleDraw {

    public SquareDraw(Point point) {
        super(point);
    }

    public SquareDraw(Point point, Point point2) {
        super(point, point2);
    }

    public SquareDraw(SquareDraw squareDraw, Point point) {
        super(squareDraw.point, point);
    }

    @Override
    public Shape getShape() {
        Point side = Point.diff(otherPoint, point);
        return new Square(point, (side.getX() < side.getY()) ? side.getX() : side.getY());
    }
}
