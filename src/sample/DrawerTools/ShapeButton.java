package sample.DrawerTools;

import javafx.scene.Node;
import javafx.scene.control.Button;
import sample.Adapters.ShapeAdapter;


public abstract class ShapeButton extends Button {

    public ShapeButton(String text) {
        super(text);
    }

    public ShapeButton(String text, Node graphic) {
        super(text, graphic);
    }

    public ShapeButton() {
        super();
    }

    public abstract ShapeAdapter getShapeAdapter();

}
