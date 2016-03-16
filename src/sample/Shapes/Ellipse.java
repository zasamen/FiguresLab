package sample.Shapes;

import javafx.scene.canvas.GraphicsContext;

public class Ellipse extends Shape {
    static {
        name = "Эллипс";
    }

    protected double radius;
    protected double otherRadius;
    public Ellipse(Point firstPoint, double radius, double otherRadius) {
        super(firstPoint);
        this.radius = radius;
        this.otherRadius = otherRadius;
    }

    public void draw(GraphicsContext graphicsContext) {
        super.draw(graphicsContext);
        graphicsContext.strokeOval(this.firstPoint.getX(), this.firstPoint.getY(), 2 * radius, 2 * otherRadius);
        graphicsContext.fillOval(this.firstPoint.getX(), this.firstPoint.getY(), 2 * radius, 2 * otherRadius);
    }

}
