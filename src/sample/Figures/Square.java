package sample.Figures;


import javafx.scene.canvas.GraphicsContext;

public class Square extends Rectangle{

    public Square(Point firstPoint,int side){
        super(firstPoint,side,side);
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        super.draw(graphicsContext);
    }
}
