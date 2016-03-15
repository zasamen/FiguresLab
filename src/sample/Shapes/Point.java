package sample.Shapes;

import javafx.scene.canvas.GraphicsContext;
import org.jetbrains.annotations.Contract;

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

    @Contract("_, _ -> !null")
    public static Point sum(Point first, Point second) {
        return new Point(first.x + second.x, first.y + second.y);
    }

    @Contract("_, _ -> !null")
    public static Point diff(Point first, Point second) {
        return sum(first, inv(second));
    }

    public static Point absDiff(Point first, Point second) {
        return new Point(Math.abs(first.x - second.x), Math.abs(first.y - second.y));
    }

    public static Point inv(Point coordinates) {
        coordinates.x = -coordinates.x;
        coordinates.y = -coordinates.y;
        return coordinates;
    }

    public static Point aver(Point first, Point second) {
        return div(sum(first, second), 2);
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

    public static Point sum(Point[] coordinatesArray) {
        Point result = new Point();
        for (Point coordinates : coordinatesArray) {
            result = sum(result, coordinates);
        }
        return result;
    }

    public static Point aver(Point[] coordinatesArray) {
        return div(sum(coordinatesArray), coordinatesArray.length);
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

    @Override
    public String toString() {
        return "Point:(" + x + ";" + y + ")";
    }

}