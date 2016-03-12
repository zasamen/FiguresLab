package sample.Figures;

import javafx.scene.canvas.GraphicsContext;
import sample.Point;

public class Polygon extends Shape {
    private Point[] points;

    public Polygon(Point[] points){
        super(points[0]);
        this.points=points;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.strokePolygon(Point.getXArray(points), Point.getYArray(points), points.length);
    }
}
