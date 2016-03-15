package sample.Shapes;

import javafx.scene.canvas.GraphicsContext;

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

    public Point addX(double x) {
        this.x += x;
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

    @Override
    public String toString() {
        return "Point:(" + x + ";" + y + ")";
    }

}