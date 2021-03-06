package sample.Shapes;


import javafx.scene.canvas.GraphicsContext;

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
        super.draw(graphicsContext);
        graphicsContext.strokeRect(this.firstPoint.getX(), this.firstPoint.getY(), side, otherSide);
        graphicsContext.fillRect(this.firstPoint.getX(), this.firstPoint.getY(), this.side, this.otherSide);
    }
}
