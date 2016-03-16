package sample.Shapes;

import javafx.scene.canvas.GraphicsContext;

public class Line extends Shape {
    static {
        name = "Линия";
    }

    protected Point lastPoint;

    public Line (Point firstPoint,Point lastPoint){
        super(firstPoint);
        this.lastPoint=lastPoint;
    }

    public void draw(GraphicsContext graphicsContext){
        super.draw(graphicsContext);
        graphicsContext.strokeLine(firstPoint.getX(),firstPoint.getY(),lastPoint.getX(),lastPoint.getY());
    }
}