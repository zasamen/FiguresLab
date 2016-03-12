package sample.Figures;

import sample.Point;

public abstract class Shape implements Drawable {
    protected static String name = "Фигура";
    protected Point firstPoint;

    Shape(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public static String getName() {
        return name;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }
}