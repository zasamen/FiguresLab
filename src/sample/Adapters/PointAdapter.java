package sample.Adapters;

import sample.Shapes.Point;

public class PointAdapter extends ShapeAdapter {

    @Override
    protected void createShape() {
        drawable = point;
    }

    @Override
    public void manageOtherPoint(Point point) {

    }

}
