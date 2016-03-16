package sample.Adapters;

import javafx.scene.paint.Color;
import sample.Shapes.Line;
import sample.Shapes.Point;

public class LineAdapter extends ShapeAdapter {

    protected Point otherPoint;

    public LineAdapter(Color color, Color fillColor) {
        super(color, fillColor);
    }
    @Override
    public void setFirstPoint(Point point) {
        otherPoint = point;
        super.setFirstPoint(point);
    }

    @Override
    public void manageOtherPoint(Point point) {
        this.otherPoint = point;
    }


    @Override
    protected void createShape() {
        drawable = new Line(point, otherPoint);
    }
}
