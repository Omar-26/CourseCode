/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import model.Instructor;
import model.LMS;
import model.Student;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 */
public class CreateAccountController implements Initializable {

    @FXML
    TextField username;
    @FXML
    TextField email;
    @FXML
    PasswordField password;
    @FXML
    PasswordField confirmPassword;
    @FXML
    Label errorL;
    @FXML
    RadioButton accountType;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private boolean isValidFields() throws IllegalArgumentException {
        if (username.getText().isEmpty() || email.getText().isEmpty() || password.getText().isEmpty() || confirmPassword.getText().isEmpty()) {
            throw new IllegalArgumentException("Please provide all data fields");
        }

        if (LMS.findAccount(username.getText()) != null) {
            throw new IllegalArgumentException("Username already exists");
        }

        if (!password.getText().equals(confirmPassword.getText())) {
            throw new IllegalArgumentException("Passwords don't match");
        }

        return true;
    }

    @FXML
    private void register() throws IOException {
        try {
            if (isValidFields()) {
                if (accountType.isSelected())
                    App.account = new Instructor(username.getText(), password.getText(), email.getText());
                else
                    App.account = new Student(username.getText(), password.getText(), email.getText());

                LMS.createAccount(App.account);
                App.setRoot("dashboard");
            }
        } catch (IllegalArgumentException e) {
            App.playErrorAnimation(errorL);
            errorL.setText(e.getMessage());
        }
    }
}
