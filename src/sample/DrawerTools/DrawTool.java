package sample.DrawerTools;

import sample.Adapters.ShapeAdapter;
import sample.Shapes.Point;

public class DrawTool {
    protected Drawer drawer;
    protected ShapeAdapter shapeAdapter;
    protected ShapeButton shapeButton;

    public DrawTool(Drawer drawer) {
        this.drawer = drawer;
    }

    public void setShapeButton(ShapeButton shapeButton) {
        this.shapeButton = shapeButton;
    }

    public Drawer getDrawer() {
        return drawer;
    }

    public void setDrawer(Drawer drawer) {
        this.drawer = drawer;
    }

    protected void finishShape(double x, double y) {
        drawer.addShapeToList(shapeAdapter.getDrawable());
        drawer.drawShapes();
    }

    protected void createShape(double x, double y) {
        shapeAdapter = shapeButton.getShapeAdapter();
        shapeAdapter.setFirstPoint(new Point(x, y));
        shapeAdapter.manageOtherPoint(new Point(x, y));
        drawer.drawShapes();
        shapeAdapter.getDrawable().draw(drawer.getGraphicsContext2D());
    }

    public void setShapeAdapter(ShapeAdapter shapeAdapter) {
        this.shapeAdapter = shapeAdapter;
    }
}
