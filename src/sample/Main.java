package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import sample.Figures.*;

import java.util.LinkedList;

public class Main extends Application {
    static LinkedList<Shape> linkedList;

    static {
        Point startDraw;
        int side;
        int otherSide;
        startDraw = new Point(20, 20);
        side = 30;
        otherSide = 60;
        linkedList = new LinkedList<>();
        linkedList.add(new Line(startDraw, startDraw.addXY(side, otherSide)));
        startDraw.addXY(side, -otherSide);
        linkedList.add(new Polygon(new Point[]{startDraw, startDraw.addXY(side / 2, otherSide / 3), startDraw.addXY(-side, otherSide / 4)}));
        startDraw.addXY(side / 2, -7 * otherSide / 12);
        linkedList.add(new Rectangle(startDraw, side, otherSide));
        startDraw = new Point(20, startDraw.getY() + side);
        linkedList.add(new Square(startDraw, side));
        startDraw.addX(side);
        linkedList.add(new Ellipse(startDraw, side, otherSide));
        startDraw.addX(side);
        linkedList.add(new Circle(startDraw, side));
    }

    private double hgap = 5;
    private double vgap = 5;
    private BorderPane root;
    private Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = new BorderPane();
        FlowPane buttonsPane = setFlowPaneComponents();
        root.setRight(buttonsPane);
        scene = new Scene(root, 800, 600);
        Canvas canvas = new Canvas(root.getHeight() - buttonsPane.getHeight(),
                root.getWidth() - buttonsPane.getWidth());
        root.setCenter(canvas);


        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setFill(Paint.valueOf("red"));
        drawShapes(graphicsContext);

        primaryStage.setTitle("Графический редактор \"ЛАБА1.2\"");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawShapes(GraphicsContext graphicsContext) {
        graphicsContext.setLineWidth(graphicsContext.getLineWidth() * 3);
        int i = linkedList.size();
        while (i-- > 0) {
            linkedList.get(i).draw(graphicsContext);
        }
    }

    private FlowPane setFlowPaneComponents() {
        FlowPane flowPane = new FlowPane(Orientation.VERTICAL, hgap, vgap);
        flowPane.setBackground(new Background(new BackgroundFill(Paint.valueOf("silver"), CornerRadii.EMPTY, Insets.EMPTY)));
        flowPane.setAlignment(Pos.TOP_CENTER);
        Button buttonLine = new Button("Линия");
        buttonLine.setBackground(flowPane.getBackground());
        Button buttonCircle = new Button("Круг");
        buttonCircle.setBorder(Border.EMPTY);
        Button buttonEllipse = new Button("Эллипс");
        buttonEllipse.setBorder(Border.EMPTY);
        Button buttonSquare = new Button("Квадрат");
        buttonSquare.setBorder(Border.EMPTY);
        Button buttonRectangle = new Button("Прямоугольник");
        buttonRectangle.setBorder(Border.EMPTY);
        Button buttonPolygon = new Button("Многоугольник");
        buttonPolygon.setBorder(Border.EMPTY);
        flowPane.getChildren().addAll(buttonCircle, buttonEllipse, buttonLine, buttonPolygon, buttonRectangle, buttonSquare);
        return flowPane;
    }

}