package sample.DrawerTools;

import javafx.scene.input.MouseButton;
import sample.Shapes.Point;

public class MultyPointShapeDrawTool extends DrawTool {
    protected boolean shapeDrawStarted;

    public MultyPointShapeDrawTool(Drawer drawer) {
        super(drawer);
        shapeDrawStarted = false;
        this.drawer.setOnMousePressed(event -> {
        });
        this.drawer.setOnMouseDragged(event -> {
        });
        this.drawer.setOnMouseReleased(event -> {
        });
        this.drawer.setOnMouseClicked(event -> manageShape(event.getX(), event.getY(), event.getButton() == MouseButton.SECONDARY));
        this.drawer.setOnMouseMoved(event -> reDrawShape(event.getX(), event.getY()));
    }

    private void manageShape(double x, double y, boolean secondaryButton) {
        if (secondaryButton) {
            finishShape(x, y);
            shapeDrawStarted = false;
        } else {
            if (shapeDrawStarted) {
                modifyShape(x, y);
            } else {
                createShape(x, y);
                shapeDrawStarted = true;
            }
        }
    }

    private void modifyShape(double x, double y) {
        shapeAdapter.manageOtherPoint(new Point(x, y));
        drawer.drawShapes();
        shapeAdapter.getDrawable().draw(drawer.getGraphicsContext2D());
    }

    private void reDrawShape(double x, double y) {
        if (!shapeDrawStarted) return;
        shapeAdapter.resetLastPoint(new Point(x, y));
        drawer.drawShapes();
        shapeAdapter.getDrawable().draw(drawer.getGraphicsContext2D());
    }

    @Override
    protected void finishShape(double x, double y) {
        shapeAdapter.resetLastPoint();
        super.finishShape(x, y);
    }
}