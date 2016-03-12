package sample.Figures;

import javafx.scene.canvas.GraphicsContext;
import sample.Point;

public abstract class Shape {
    protected Point firstPoint;

    Shape(Point firstPoint){
        this.firstPoint=firstPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }
    public abstract void draw(GraphicsContext graphicsContext);
}
