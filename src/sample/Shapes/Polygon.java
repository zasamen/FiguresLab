package sample.Shapes;

import javafx.scene.canvas.GraphicsContext;

public class Polygon extends Shape {
    static {
        name = "Многоугольник";
    }

    private Point[] points;
    public Polygon(Point[] points){
        super(points[0]);
        this.points=points;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        super.draw(graphicsContext);
        graphicsContext.strokePolygon(Point.getXArray(points), Point.getYArray(points), points.length);
        graphicsContext.fillPolygon(Point.getXArray(points), Point.getYArray(points), points.length);
    }
}
