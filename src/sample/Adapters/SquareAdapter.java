package sample.Adapters;

import javafx.scene.paint.Color;
import sample.Shapes.Point;
import sample.Shapes.Square;

public class SquareAdapter extends RectangleAdapter {

    public SquareAdapter(Color color, Color fillColor) {
        super(color, fillColor);
    }
    @Override
    protected void createShape() {
        double deltaX = Math.abs(point.getX() - otherPoint.getX());
        double deltaY = Math.abs(point.getY() - otherPoint.getY());
        double side = (deltaX < deltaY) ? deltaX : deltaY;
        drawable = new Square(Point.getTopLeft(point, otherPoint, side, side), side);
    }

}
