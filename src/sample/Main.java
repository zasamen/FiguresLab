package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import org.jetbrains.annotations.Contract;
import sample.Adapters.*;
import sample.DrawerTools.*;
import sample.Shapes.*;

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

    Drawer drawer;
    private Insets toolbarInsets = new Insets(5, 5, 5, 5);

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
        drawer = new Drawer(root.getHeight() - buttonsHBox.getHeight(),
                root.getWidth() - buttonsHBox.getWidth());
        root.setCenter(drawer);

        GraphicsContext graphicsContext = drawer.getGraphicsContext2D();
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

        ShapeButton buttonLine = new ShapeButton("Линия") {
            @Contract(" -> !null")
            @Override
            public ShapeAdapter getShapeAdapter() {
                return new LineAdapter();
            }
        };
        buttonLine.setOnMouseClicked(event -> {
            drawer.setDrawTool(new TwoPointShapeDrawTool(drawer));
            drawer.getDrawTool().setShapeButton(buttonLine);
        });
        ShapeButton buttonCircle = new ShapeButton("Круг") {
            @Contract(" -> !null")
            @Override
            public ShapeAdapter getShapeAdapter() {
                return new CircleAdapter();
            }
        };
        buttonCircle.setOnMouseClicked(event -> {
            drawer.setDrawTool(new TwoPointShapeDrawTool(drawer));
            drawer.getDrawTool().setShapeButton(buttonCircle);
        });
        ShapeButton buttonEllipse = new ShapeButton("Эллипс") {
            @Contract(" -> !null")
            @Override
            public ShapeAdapter getShapeAdapter() {
                return new EllipseAdapter();
            }
        };
        buttonEllipse.setOnAction(event1 -> {
            drawer.setDrawTool(new TwoPointShapeDrawTool(drawer));
            drawer.getDrawTool().setShapeButton(buttonEllipse);
        });
        ShapeButton buttonSquare = new ShapeButton("Квадрат") {
            @Contract(" -> !null")
            @Override
            public ShapeAdapter getShapeAdapter() {
                return new SquareAdapter();
            }
        };
        buttonSquare.setOnMouseClicked(event -> {
            drawer.setDrawTool(new TwoPointShapeDrawTool(drawer));
            drawer.getDrawTool().setShapeButton(buttonSquare);
        });
        ShapeButton buttonRectangle = new ShapeButton("Прямоугольник") {
            @Contract(" -> !null")
            @Override
            public ShapeAdapter getShapeAdapter() {
                return new RectangleAdapter();
            }
        };
        buttonRectangle.setOnAction(event -> {
            drawer.setDrawTool(new TwoPointShapeDrawTool(drawer));
            drawer.getDrawTool().setShapeButton(buttonRectangle);
        });
        ShapeButton buttonPolygon = new ShapeButton("Многоугольник") {
            @Contract(" -> !null")
            @Override
            public ShapeAdapter getShapeAdapter() {
                return new PolygonAdapter();
            }
        };
        buttonPolygon.setOnAction(event -> {
            drawer.setDrawTool(new MultyPointShapeDrawTool(drawer));
            drawer.getDrawTool().setShapeButton(buttonPolygon);
        });
        ShapeButton buttonPoint = new ShapeButton("Точка") {
            @Contract(" -> !null")
            @Override
            public ShapeAdapter getShapeAdapter() {
                return new PointAdapter();
            }
        };
        buttonPoint.setOnAction(event -> {
            drawer.setDrawTool(new MonoPointShapeDrawTool(drawer));
            drawer.getDrawTool().setShapeButton(buttonPoint);
        });
        Button buttonUndo = new Button("Отменить последнее");
        buttonUndo.setOnAction(event -> drawer.removeLastShape());
        hBox.getChildren().addAll(buttonCircle, buttonEllipse, buttonLine, buttonPolygon, buttonRectangle, buttonSquare,
                buttonPoint, buttonUndo);
        return hBox;
    }


}