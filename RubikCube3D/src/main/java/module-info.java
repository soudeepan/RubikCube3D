module rubik.cube.rubikcube3d {
    requires javafx.controls;
    requires javafx.fxml;


    opens rubik.cube.rubikcube3d to javafx.fxml;
    exports rubik.cube.rubikcube3d;
}