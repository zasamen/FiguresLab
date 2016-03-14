package sample.Drawers;

import javafx.scene.control.Button;
import sample.Adapters.ShapeAdapter;
import sample.Shapes.Shape;

public class DrawTool {
    protected Drawer drawer;
    protected Button button = new Button(Shape.getName());
    protected Shape shape;
    protected ShapeAdapter shapeAdapter;

    public DrawTool(Drawer drawer) {
        this.drawer = drawer;
    }

    public Button getButton() {
        return button;
    }


    public Drawer getDrawer() {
        return drawer;
    }

    public void finishShape() {

    }

    public void setShapeAdapter(ShapeAdapter shapeAdapter) {
        this.shapeAdapter = shapeAdapter;
    }
}
