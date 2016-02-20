package sample.Figures;

import javafx.scene.canvas.GraphicsContext;

public class Line extends Shape {
    protected Point lastPoint;

    public Line (Point firstPoint,Point lastPoint){
        super(firstPoint);
        this.lastPoint=lastPoint;
    }
    public void draw(GraphicsContext graphicsContext){

    }
}