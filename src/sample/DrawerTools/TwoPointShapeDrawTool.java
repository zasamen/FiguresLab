package sample.DrawerTools;

import sample.Shapes.Point;

public class TwoPointShapeDrawTool extends DrawTool {

    public TwoPointShapeDrawTool(Drawer drawer) {
        super(drawer);
        this.drawer.setOnMousePressed(event -> createShape(event.getX(), event.getY()));
        this.drawer.setOnMouseDragged(event -> changeShape(event.getX(), event.getY()));
        this.drawer.setOnMouseReleased(event -> finishShape(event.getX(), event.getY()));
        this.drawer.setOnMouseClicked(event -> {
        });
        this.drawer.setOnMouseMoved(event -> {
        });
    }

    private void changeShape(double x, double y) {
        shapeAdapter.manageOtherPoint(new Point(x, y));
        drawer.drawShapes();
        shapeAdapter.getDrawable().draw(drawer.getGraphicsContext2D());
    }
}
