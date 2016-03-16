package sample.Shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public interface Drawable {

    void setColor(Color color);

    void setFillColor(Color color);

    void draw(GraphicsContext graphicsContext);
}
