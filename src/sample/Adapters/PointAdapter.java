package sample.Adapters;

import javafx.scene.paint.Color;
import sample.Shapes.Point;

public class PointAdapter extends ShapeAdapter {

    public PointAdapter(Color color, Color fillColor) {
        super(color, fillColor);
    }

    @Override
    protected void createShape() {
        drawable = point;
    }

    @Override
    public void manageOtherPoint(Point point) {

    }

}
