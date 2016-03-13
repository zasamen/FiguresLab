package sample.Adapters;

import sample.Shapes.Point;
import sample.Shapes.Shape;

public abstract class ShapeAdapter {
    protected Point point;

    public abstract Shape getShapeToDraw();
}
