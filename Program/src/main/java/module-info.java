module controller {
    requires javafx.controls;
    requires javafx.fxml;
   requires java.base;

    opens controller to javafx.fxml;
    exports controller;
   requires javafx.baseEmpty;
   requires fontawesomefx;
   requires javafx.controlsEmpty;
   requires javafx.fxmlEmpty;
   requires javafx.graphicsEmpty;
   requires javafx.graphics;
   requires javafx.base;
}
