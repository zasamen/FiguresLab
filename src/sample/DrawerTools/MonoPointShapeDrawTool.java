package sample.DrawerTools;

public class MonoPointShapeDrawTool extends DrawTool {

    public MonoPointShapeDrawTool(Drawer drawer) {
        super(drawer);
        this.drawer.setOnMousePressed(event -> {
        });
        this.drawer.setOnMouseDragged(event -> {
        });
        this.drawer.setOnMouseReleased(event -> {
        });
        this.drawer.setOnMouseClicked(event -> {
            createShape(event.getX(), event.getY());
            finishShape(event.getX(), event.getY());
        });
        this.drawer.setOnMouseMoved(event -> {
        });
    }

}
