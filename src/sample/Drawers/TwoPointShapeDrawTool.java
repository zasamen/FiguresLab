package sample.Drawers;

public class TwoPointShapeDrawTool extends DrawTool {

    public TwoPointShapeDrawTool(Drawer drawer) {
        super(drawer);
        this.drawer.setOnMousePressed(event -> createShape(event.getX(), event.getY()));
        this.drawer.setOnMouseDragged(event -> changeShape(event.getX(), event.getY()));
        this.drawer.setOnMouseReleased(event -> finishShape(event.getX(), event.getY()));
    }

    private void createShape(double x, double y) {

    }

    private void changeShape(double x, double y) {

    }

    private void finishShape(double x, double y) {

    }
}
