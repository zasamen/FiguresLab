package sample.Shapes;

public abstract class Shape implements Drawable {
    protected static String name = "Фигура";
    protected Point firstPoint;

    Shape(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

}