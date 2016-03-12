package sample;

import javafx.scene.canvas.GraphicsContext;
import sample.Figures.Drawable;

public class Point implements Drawable {
    protected double x;
    protected double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point summ(Point first, Point second) {
        return new Point(first.x + second.x, first.y + second.y);
    }

    public static Point diff(Point first, Point second) {
        return summ(first, inv(second));
    }

    public static Point inv(Point coordinates) {
        coordinates.x = -coordinates.x;
        coordinates.y = -coordinates.y;
        return coordinates;
    }

    public static Point aver(Point first, Point second) {
        return div(summ(first, second), 2);
    }

    public static Point mul(Point point, double multiplier) {
        point.x *= multiplier;
        point.y *= multiplier;
        return point;
    }

    public static Point div(Point point, double divisor) {
        point.x /= divisor;
        point.y /= divisor;
        return point;
    }

    public static Point summ(Point[] coordinatesArray) {
        Point result = new Point();
        for (Point coordinates : coordinatesArray) {
            result = summ(result, coordinates);
        }
        return result;
    }

    public static Point aver(Point[] coordinatesArray) {
        return div(summ(coordinatesArray), coordinatesArray.length);
    }

    public static double getLength(Point first, Point second) {
        Point result = diff(first, second);
        return Math.sqrt(result.x * result.x + result.y * result.y);
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

    public Point addX(double x) {
        this.x += x;
        return this;
    }

    public Point addY(double y) {
        this.y += y;
        return this;
    }

    public Point addXY(double x, double y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public double getY() {
        return this.y;
    }

    public double getX() {
        return this.x;
    }

    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.strokeLine(x, y, x, y);
    }

}