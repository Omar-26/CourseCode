/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import model.Instructor;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author A.Ashraf
 */
public class DashboardController implements Initializable {
    @FXML
    AnchorPane quizPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (App.account instanceof Instructor)
            quizPane.setVisible(false);
    }

    @FXML
    public void goToSetting() throws IOException {
        App.setRoot("setting");
    }

    @FXML
    public void goToMyLearning() throws IOException {
        App.setRoot("mylearning");
    }

    @FXML
    public void goToMyQuiz() throws IOException {
        App.setRoot("hello-view");
    }

    @FXML
    public void goToLogin() throws IOException {
        App.account = null;
        App.setRoot("login");
        System.out.println("You logged out");
    }

}
