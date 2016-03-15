package sample.DrawerTools;

import javafx.scene.control.Button;
import sample.Adapters.ShapeAdapter;


public abstract class ShapeButton extends Button {

    public ShapeButton(String text) {
        super(text);
    }

    public abstract ShapeAdapter getShapeAdapter();

}
