package sample.Adapters;

import javafx.scene.paint.Color;
import sample.Shapes.Circle;
import sample.Shapes.Point;

public class CircleAdapter extends EllipseAdapter {

    public CircleAdapter(Color color, Color fillColor) {
        super(color, fillColor);
    }

    @Override
    protected void createShape() {
        double deltaX = Math.abs(point.getX() - otherPoint.getX());
        double deltaY = Math.abs(point.getY() - otherPoint.getY());
        double diameter = (deltaX < deltaY) ? deltaX : deltaY;
        drawable = new Circle(Point.getTopLeft(point, otherPoint, diameter, diameter), diameter / 2);
    }
}