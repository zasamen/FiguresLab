package sample.Figures;

import javafx.scene.canvas.GraphicsContext;

public class Polygon extends Shape {
    private Point[] points;

    public Polygon(Point[] points){
        super(points[0]);
        this.points=points;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {

    }
}
