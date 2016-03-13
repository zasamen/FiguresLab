package sample.Shapes;

public class Circle extends Ellipse {

    static {
        name = "Круг";
    }

    public Circle(Point firstPoint, double radius) {
        super(firstPoint,radius,radius);
    }

}
