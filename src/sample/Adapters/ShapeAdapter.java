package sample.Adapters;

import javafx.scene.paint.Color;
import sample.Shapes.Drawable;
import sample.Shapes.Point;


public abstract class ShapeAdapter {
    protected Point point = new Point(0, 0);
    protected Drawable drawable;
    protected Color borderColor;
    protected Color fillColor;

    public ShapeAdapter(Color color, Color fillColor) {
        this.borderColor = color;
        this.fillColor = fillColor;
    }

    public void setColor(Color color) {
        borderColor = color;
    }

    public void setFillColor(Color color) {
        fillColor = color;
    }

    public void setFirstPoint(Point point) {
        this.point = point;
    }

    public abstract void manageOtherPoint(Point point);

    public void resetLastPoint(Point point) {
    }

    public void resetLastPoint() {
    }

    public Drawable getDrawable() {
        createShape();
        drawable.setColor(borderColor);
        drawable.setFillColor(fillColor);
        return drawable;
    }

    protected abstract void createShape();

}
