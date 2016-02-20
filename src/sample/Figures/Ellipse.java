package sample.Figures;

import javafx.scene.canvas.GraphicsContext;

public class Ellipse extends Shape {
    protected int littleRadius;
    protected int bigRadius;

    public Ellipse(Point firstPoint,int littleRadius,int bigRadius) {
        super(firstPoint);
        this.littleRadius=littleRadius;
        this.bigRadius=bigRadius;
    }

    public void draw(GraphicsContext graphicsContext) {

    }

}
