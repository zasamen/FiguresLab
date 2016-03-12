package sample.Figures;


import javafx.scene.canvas.GraphicsContext;
import sample.Point;

public class Rectangle extends Shape {
    static {
        name = "Прямоугольник";
    }

    protected double side;
    protected double otherSide;
    public Rectangle(Point firstPoint, double side, double otherSide) {
        super(firstPoint);
        this.side=side;
        this.otherSide=otherSide;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.strokeRect(this.firstPoint.getX(), this.firstPoint.getY(), side, otherSide);
    }
}
