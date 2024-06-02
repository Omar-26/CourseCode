/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author A.Ashraf
 */
public class SettingController implements Initializable {
    Stage window = new Stage();

    @FXML
    TextField username;
    @FXML
    TextField name;
    @FXML
    TextField password;
    @FXML
    TextField age;
    @FXML
    TextField email;
    @FXML
    Label savedMesg;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        var account = App.account;
        name.setPromptText(account.getFullName());
        password.setPromptText(account.getPassword());
        email.setPromptText(account.getEmail());
        age.setPromptText(String.valueOf(account.getAge()));
        username.setText(account.getUserName());
    }

    @FXML
    public void goToDashboard() throws IOException {
        App.setRoot("dashboard");
    }

    @FXML
    public void goToLogin() throws IOException {
        App.setRoot("login");
    }

    @FXML
    public void goToMyLearning() throws IOException {
        App.setRoot("mylearning");
    }

    private void playSavedAnimation() {
        FadeTransition ft1 = new FadeTransition(Duration.seconds(5), savedMesg);
        savedMesg.setVisible(true);
        ft1.setFromValue(1.0);
        ft1.setToValue(0);
        ft1.play();
    }

    @FXML
    public void saveChangesAction() {
        if (!name.getText().equals(""))
            App.account.setFullName(name.getText());
        if (!email.getText().equals(""))
            App.account.setEmail(email.getText());
        if (!password.getText().equals(""))
            App.account.setPassword(password.getText());
        if (!age.getText().equals(""))
            App.account.setAge(Integer.parseInt(age.getText()));
        if (!name.getText().equals("") || !email.getText().equals("") || !password.getText().equals("") || !age.getText().equals(""))
            playSavedAnimation();

    }
}
