package sample.Figures;


import javafx.scene.canvas.GraphicsContext;

public class Rectangle extends Shape {
    protected double side;
    protected double otherSide;

    public Rectangle(Point firstPoint,double side,double otherSide){
        super(firstPoint);
        this.side=side;
        this.otherSide=otherSide;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.strokeRect(this.firstPoint.getX(), this.firstPoint.getY(), side, otherSide);
    }
}
