package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import sample.Drawers.*;
import sample.Figures.*;

import java.util.LinkedList;

public class Main extends Application {

    static LinkedList<Shape> linkedList;

    static {
        Point startDraw = new Point(20, 20);
        int side = 30;
        int otherSide = 60;
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

    LinkedList<Button> buttonList;
    private Insets toolbarInsets = new Insets(5, 5, 5, 5);
    private boolean drawing = false;
    private Drawable drawUnit;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene;
        BorderPane root;
        root = new BorderPane();
        HBox buttonsHBox = setHBoxComponents();
        root.setTop(buttonsHBox);
        scene = new Scene(root, 800, 600);
        Canvas canvas = new Canvas(root.getHeight() - buttonsHBox.getHeight(),
                root.getWidth() - buttonsHBox.getWidth());
        root.setCenter(canvas);

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setStroke(Paint.valueOf("red"));
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

    private HBox setHBoxComponents() {
        HBox hBox = new HBox();
        hBox.setPadding(toolbarInsets);
        hBox.setAlignment(Pos.CENTER);
        hBox.setBackground(new Background(new BackgroundFill(Paint.valueOf("LightSkyBlue"), CornerRadii.EMPTY, Insets.EMPTY)));
        Button buttonLine = new Button("Линия");
        Button buttonCircle = new Button("Круг");
        Button buttonEllipse = new Button("Эллипс");
        Button buttonSquare = new Button("Квадрат");
        Button buttonRectangle = new Button("Прямоугольник");
        Button buttonPolygon = new Button("Многоугольник");
        hBox.getChildren().addAll(buttonCircle, buttonEllipse, buttonLine, buttonPolygon, buttonRectangle, buttonSquare);
        return hBox;
    }

    private LinkedList<Button> initializeButtonList() {
        LinkedList<Button> linkedList = new LinkedList<>();

        return new LinkedList<>(buttonList);
    }

    private LinkedList<Class<? extends ShapeDraw>> initializeDrawableList() {
        LinkedList<Class<? extends ShapeDraw>> linkedList = new LinkedList<>();
        linkedList.add(CircleDraw.class);
        linkedList.add(EllipseDraw.class);
        linkedList.add(LineDraw.class);
        linkedList.add(PolygonDraw.class);
        linkedList.add(RectangleDraw.class);
        linkedList.add(SquareDraw.class);
        return linkedList;
    }
}