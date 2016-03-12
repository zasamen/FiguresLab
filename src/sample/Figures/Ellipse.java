package sample.Figures;

import javafx.scene.canvas.GraphicsContext;
import sample.Point;

public class Ellipse extends Shape {
    protected double radius;
    protected double otherRadius;

    public Ellipse(Point firstPoint, double radius, double otherRadius) {
        super(firstPoint);
        this.radius = radius;
        this.otherRadius = otherRadius;
    }

    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.strokeOval(this.firstPoint.getX(), this.firstPoint.getY(), 2 * radius, 2 * otherRadius);
    }

}
