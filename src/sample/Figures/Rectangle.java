package sample.Figures;


import javafx.scene.canvas.GraphicsContext;

public class Rectangle extends Shape {
    protected int side;
    protected int otherSide;

    public Rectangle(Point firstPoint,int side,int otherSide){
        super(firstPoint);
        this.side=side;
        this.otherSide=otherSide;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {

    }
}
