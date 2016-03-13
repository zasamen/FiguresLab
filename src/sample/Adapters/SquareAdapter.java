package sample.Adapters;

import sample.Shapes.Point;
import sample.Shapes.Shape;
import sample.Shapes.Square;

public class SquareAdapter extends RectangleAdapter {

    public SquareAdapter(Point point) {
        super(point);
    }

    public SquareAdapter(Point point, Point point2) {
        super(point, point2);
    }

    public SquareAdapter(SquareAdapter squareDraw, Point point) {
        super(squareDraw.point, point);
    }

    @Override
    public Shape getShapeToDraw() {
        Point side = Point.diff(otherPoint, point);
        return new Square(point, (side.getX() < side.getY()) ? side.getX() : side.getY());
    }
}
