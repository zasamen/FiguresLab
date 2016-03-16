package sample.Adapters;

import javafx.scene.paint.Color;
import sample.Shapes.Point;
import sample.Shapes.Rectangle;

public class RectangleAdapter extends ShapeAdapter {

    protected Point otherPoint = new Point();


    public RectangleAdapter(Color color, Color fillColor) {
        super(color, fillColor);
    }
    @Override
    public void manageOtherPoint(Point point) {
        otherPoint = point;
    }


    @Override
    public void setFirstPoint(Point point) {
        otherPoint = point;
        super.setFirstPoint(point);
    }

    @Override
    protected void createShape() {
        double side = Math.abs(point.getX() - otherPoint.getX());
        double otherSide = Math.abs(point.getY() - otherPoint.getY());
        drawable = new Rectangle(Point.getTopLeft(point, otherPoint, side, otherSide), side, otherSide);
    }
}
