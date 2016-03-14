package sample.Drawers;

import javafx.scene.canvas.Canvas;
import sample.Shapes.Shape;

import java.util.LinkedList;
import java.util.List;

public class Drawer extends Canvas {
    List<Shape> shapeList = new LinkedList<>();
    DrawTool drawTool;
    Shape shape;

    public void drawShapes() {
        for (Shape shape :
                shapeList) {
            shape.draw(this.getGraphicsContext2D());
        }
    }

    public void addShapeToList() {
        if (shape != null) {
            shapeList.add(shape);
        }
    }

    public void setDrawTool(DrawTool drawTool) {
        if (drawTool != null) {
            drawTool.finishShape();
        }

    }
}
