package sample.DrawerTools;

import javafx.scene.canvas.Canvas;
import sample.Shapes.Drawable;

import java.util.LinkedList;
import java.util.List;

public class Drawer extends Canvas {
    List<Drawable> shapeList = new LinkedList<>();
    DrawTool drawTool;

    public Drawer() {
        super(0, 0);
    }

    public Drawer(double width, double height) {
        super(width, height);
    }

    public void drawShapes() {
        this.getGraphicsContext2D().clearRect(0, 0, getWidth(), getHeight());
        for (Drawable shape :
                shapeList) {
            shape.draw(this.getGraphicsContext2D());
        }
    }

    public void addShapeToList(Drawable shape) {
        if (shape != null) {
            shapeList.add(shape);
        }
        drawShapes();
    }

    public void removeLastShape() {
        if (shapeList != null) {
            if (shapeList.size() != 0) {
                shapeList.remove(shapeList.size() - 1);
            }
        }
        drawShapes();
    }

    public DrawTool getDrawTool() {
        return drawTool;
    }

    public void setDrawTool(DrawTool drawTool) {
        this.drawTool = drawTool;
    }
}
