package sample.Adapters;

import sample.Shapes.Point;
import sample.Shapes.Square;

public class SquareAdapter extends RectangleAdapter {

    @Override
    protected void createShape() {
        Point side = Point.diff(otherPoint, point);
        shape = new Square(point, (side.getX() < side.getY()) ? side.getX() : side.getY());
    }
}
