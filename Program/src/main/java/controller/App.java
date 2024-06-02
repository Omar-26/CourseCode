package controller;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.*;

import java.io.IOException;
import java.util.ArrayList;


public class App extends Application {

    static Account account;
    static Course course;
    private static Scene page;
    private static Stage window;

    static void setRoot(String fxml) throws IOException {
        page = new Scene(loadFXML(fxml));
        window.setScene(page);
        window.centerOnScreen();
        window.show();
//    window.initStyle(StageStyle.TRANSPARENT);
//    page.setFill(Color.TRANSPARENT);
//    return window;
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    static void playErrorAnimation(Node n) {
        FadeTransition ft1 = new FadeTransition(Duration.seconds(5), n);
        n.setVisible(true);
        ft1.setFromValue(1.0);
        ft1.setToValue(0);
        ft1.play();
    }

    public static void main(String[] args) {
        SystemTest.TestGUI();
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        page = new Scene(loadFXML("login"));
        window.setScene(page);
        window.show();
//        window.setOnCloseRequest(eh -> {
//            System.out.println("Our system Logs:");
//            System.out.println("\nAccounts:-");
//            displayInfo(LMS.getAccounts());
//            System.out.println("\nCourses:-");
//            displayInfo(LMS.getCourses());
//        });
    }

    private void displayInfo(ArrayList<? extends displayable> objects) {
        for (var obj : objects)
            obj.display();
    }


}
