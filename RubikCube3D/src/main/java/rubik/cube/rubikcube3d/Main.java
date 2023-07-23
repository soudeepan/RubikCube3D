package rubik.cube.rubikcube3d;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private double anchorX, anchorY;
    private double anchorAngleX = 0;
    private double anchorAngleY = 0;
    private final DoubleProperty angleX = new SimpleDoubleProperty(0);
    private final DoubleProperty angleY = new SimpleDoubleProperty(0);


    @Override
    public void start(Stage stage) throws IOException {

        Rubik rubik = new Rubik();
        SmartGroup theCube = rubik.getMyRoot();

        Button fButton = new Button("F");
        fButton.setOnMouseClicked(mouseEvent -> rubik.fMove());
        fButton.setPrefSize(40,10);

        Button fiButton = new Button("F'");
        fiButton.setOnMouseClicked(mouseEvent -> rubik.fPrimeMove());
        fiButton.setPrefSize(40,10);

        Button f2Button = new Button("F2");
        f2Button.setOnMouseClicked(mouseEvent -> rubik.f2Move());
        f2Button.setPrefSize(40,10);

        Button rButton = new Button("R");
        rButton.setOnMouseClicked(mouseEvent -> rubik.rMove());
        rButton.setPrefSize(40,10);

        Button riButton = new Button("R'");
        riButton.setOnMouseClicked(mouseEvent -> rubik.rPrimeMove());
        riButton.setPrefSize(40,10);

        Button r2Button = new Button("R2");
        r2Button.setOnMouseClicked(mouseEvent -> rubik.r2Move());
        r2Button.setPrefSize(40,10);

        Button lButton = new Button("L");
        lButton.setOnMouseClicked(mouseEvent -> rubik.lMove());
        lButton.setPrefSize(40,10);

        Button liButton = new Button("L'");
        liButton.setOnMouseClicked(mouseEvent -> rubik.lPrimeMove());
        liButton.setPrefSize(40,10);

        Button l2Button = new Button("L2");
        l2Button.setOnMouseClicked(mouseEvent -> rubik.r2Move());
        l2Button.setPrefSize(40,10);

        Button uButton = new Button("U");
        uButton.setOnMouseClicked(mouseEvent -> rubik.uMove());
        uButton.setPrefSize(40,10);

        Button uiButton = new Button("U'");
        uiButton.setOnMouseClicked(mouseEvent -> rubik.uPrimeMove());
        uiButton.setPrefSize(40,10);

        Button u2Button = new Button("U2");
        u2Button.setOnMouseClicked(mouseEvent -> rubik.u2Move());
        u2Button.setPrefSize(40,10);

        Button bButton = new Button("B");
        bButton.setOnMouseClicked(mouseEvent -> rubik.bMove());
        bButton.setPrefSize(40,10);

        Button biButton = new Button("B'");
        biButton.setOnMouseClicked(mouseEvent -> rubik.bPrimeMove());
        biButton.setPrefSize(40,10);

        Button b2Button = new Button("B2");
        b2Button.setOnMouseClicked(mouseEvent -> rubik.b2Move());
        b2Button.setPrefSize(40,10);

        Button dButton = new Button("D");
        dButton.setOnMouseClicked(mouseEvent -> rubik.dMove());
        dButton.setPrefSize(40,10);

        Button diButton = new Button("D'");
        diButton.setOnMouseClicked(mouseEvent -> rubik.dPrimeMove());
        diButton.setPrefSize(40,10);

        Button d2Button = new Button("D2");
        d2Button.setOnMouseClicked(mouseEvent -> rubik.d2Move());
        d2Button.setPrefSize(40,10);


        GridPane gridPane = new GridPane();
        gridPane.setTranslateX(20);
        gridPane.setTranslateY(20);
        gridPane.getChildren().addAll(fButton,fiButton,f2Button,riButton,rButton,r2Button,lButton,l2Button,liButton,bButton,b2Button,biButton,dButton,d2Button,diButton,uButton,uiButton,u2Button);

        Group wholeGroup = new Group(theCube,gridPane);

        gridPane.setHgap(10.0);
        gridPane.setVgap(10.0);

        GridPane.setColumnIndex(fButton,0);
        GridPane.setColumnIndex(rButton,0);
        GridPane.setColumnIndex(bButton,0);
        GridPane.setColumnIndex(dButton,0);
        GridPane.setColumnIndex(lButton,0);
        GridPane.setColumnIndex(uButton,0);

        GridPane.setRowIndex(fButton,0);
        GridPane.setRowIndex(rButton,1);
        GridPane.setRowIndex(bButton,2);
        GridPane.setRowIndex(dButton,3);
        GridPane.setRowIndex(lButton,4);
        GridPane.setRowIndex(uButton,5);

        GridPane.setColumnIndex(fiButton,1);
        GridPane.setColumnIndex(riButton,1);
        GridPane.setColumnIndex(biButton,1);
        GridPane.setColumnIndex(diButton,1);
        GridPane.setColumnIndex(liButton,1);
        GridPane.setColumnIndex(uiButton,1);

        GridPane.setRowIndex(fiButton,0);
        GridPane.setRowIndex(riButton,1);
        GridPane.setRowIndex(biButton,2);
        GridPane.setRowIndex(diButton,3);
        GridPane.setRowIndex(liButton,4);
        GridPane.setRowIndex(uiButton,5);

        GridPane.setColumnIndex(f2Button,2);
        GridPane.setColumnIndex(r2Button,2);
        GridPane.setColumnIndex(b2Button,2);
        GridPane.setColumnIndex(d2Button,2);
        GridPane.setColumnIndex(l2Button,2);
        GridPane.setColumnIndex(u2Button,2);

        GridPane.setRowIndex(f2Button,0);
        GridPane.setRowIndex(r2Button,1);
        GridPane.setRowIndex(b2Button,2);
        GridPane.setRowIndex(d2Button,3);
        GridPane.setRowIndex(l2Button,4);
        GridPane.setRowIndex(u2Button,5);


        Scene scene = new Scene(wholeGroup,900,500,true);
        stage.setTitle("The Rubik Cube");

        // WASD controls

       /*

       stage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            switch (event.getCode()) {
                case W -> theCube.rotateByX(2);
                case S -> theCube.rotateByX(-2);
                case D -> theCube.rotateByY(2);
                case A -> theCube.rotateByY(-2);
            }
        });

        */

        // Mouse Control

        Rotate xRotate;
        Rotate yRotate;

        theCube.getTransforms().addAll(
                xRotate = new Rotate(0, Rotate.X_AXIS),
                yRotate = new Rotate(0, Rotate.Y_AXIS)
        );

        xRotate.angleProperty().bind(angleX);
        yRotate.angleProperty().bind(angleY);

        scene.setOnMousePressed(event -> {
            anchorX = event.getSceneX();
            anchorY = event.getSceneY();
            anchorAngleX = angleX.get();
            anchorAngleY = angleY.get();
        });

        scene.setOnMouseDragged(event -> {
            angleX.set(anchorAngleX - (anchorY - event.getSceneY()));
            angleY.set(anchorAngleY + anchorX - event.getSceneX());
        });


        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}