package sample.Shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public abstract class Shape implements Drawable {
    protected static String name = "Фигура";
    protected Point firstPoint;
    protected Color borderColor;
    protected Color fillColor;

    Shape(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public void setFillColor(Color color) {
        fillColor = color;
    }

    public Color getColor() {
        return borderColor;
    }

    @Override
    public void setColor(Color color) {
        borderColor = color;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setStroke(Paint.valueOf(borderColor.toString()));
        graphicsContext.setFill(Paint.valueOf(fillColor.toString()));
    }

}