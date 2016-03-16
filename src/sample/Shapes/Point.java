package sample.Shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Point implements Drawable {
    protected double x;
    protected double y;
    protected Color color;

    public Point() {
        x = 0;
        y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double[] getXArray(Point[] points) {
        double[] result = new double[points.length];
        for (int i = 0; i < points.length; i++) {
            result[i] = points[i].getX();
        }
        return result;
    }

    public static double[] getYArray(Point[] points) {
        double[] result = new double[points.length];
        for (int i = 0; i < points.length; i++) {
            result[i] = points[i].getY();
        }
        return result;
    }

    public static Point getTopLeft(Point point, Point otherPoint, double dX, double dY) {
        if (point.x < otherPoint.x) {
            if (point.y < otherPoint.y) {
                return point;
            } else {
                return new Point(point.x, point.y - dY);
            }
        } else {
            if (point.y < otherPoint.y) {
                return new Point(point.x - dX, point.y);
            } else {
                return new Point(point.x - dX, point.y - dY);
            }
        }
    }

    @Override
    public void setFillColor(Color color) {

    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    public double getY() {
        return this.y;
    }

    public double getX() {
        return this.x;
    }

    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setStroke(Paint.valueOf(color.toString()));
        graphicsContext.strokeLine(x, y, x, y);
    }

    @Override
    public String toString() {
        return "Point:(" + x + ";" + y + ")";
    }

}