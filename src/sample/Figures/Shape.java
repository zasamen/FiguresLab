package sample.Figures;

import javafx.scene.canvas.GraphicsContext;

public abstract class Shape {
    protected Point firstPoint;

    Shape(Point firstPoint){
        this.firstPoint=firstPoint;
    }
    public abstract void draw(GraphicsContext graphicsContext);
}
