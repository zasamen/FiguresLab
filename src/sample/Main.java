package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import sample.Figures.*;

import java.util.LinkedList;

public class Main extends Application {
    BorderPane root;
    Scene scene;
    GraphicsContext buferGraphicsContext;


    public static Point startDraw;

    static LinkedList<Shape> linkedList;

    static {
        int side;
        int otherSide;
        startDraw = new Point(20,20);
        side=30;
        otherSide=60;
        linkedList = new LinkedList<>();
        linkedList.add(new Line(startDraw,startDraw.addXY(side,otherSide)));
        startDraw.addXY(side,-otherSide);
        linkedList.add(new Polygon(new Point[]{startDraw,startDraw.addXY(side/2,otherSide/3),startDraw.addXY(-side,otherSide/4)}));
        startDraw.addXY(side/2,-7*otherSide/12);
        linkedList.add(new Rectangle(startDraw,side,otherSide));
        startDraw=new Point(20,startDraw.getY()+side);
        linkedList.add(new Square(startDraw,side));
        startDraw.addX(side);
        linkedList.add(new Ellipse(startDraw,side,otherSide));
        startDraw.addX(side);
        linkedList.add(new Circle(startDraw,side));
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = new BorderPane();
        Canvas canvas = new Canvas(500, 500);
        root.setCenter(canvas);

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setFill(Paint.valueOf("red"));
        drawShapes(graphicsContext);


        scene = new Scene(root, 300, 500);
        primaryStage.setTitle("Drower");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void drawShapes(GraphicsContext graphicsContext) {
        graphicsContext.setLineWidth(graphicsContext.getLineWidth() * 3);
        int i = linkedList.size();
        while (i-- > 0) {
            linkedList.pop().draw(graphicsContext);
            graphicsContext.restore();}
    }

}