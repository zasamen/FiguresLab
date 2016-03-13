package sample.Shapes;

public class Square extends Rectangle{

    static {
        name = "Квадрат";
    }
    public Square(Point firstPoint, double side) {
        super(firstPoint,side,side);
    }
}
