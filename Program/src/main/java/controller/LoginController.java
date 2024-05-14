/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import system.LMS;

/**
 * FXML Controller class
 *
 * @author A.Ashraf
 */
public class LoginController implements Initializable
{

   @FXML
   TextField userName;
   @FXML
   PasswordField password;
   @FXML
   Label error;
   /**
    * Initializes the controller class.
    */
   @Override
   public void initialize(URL url, ResourceBundle rb)
   {
      // TODO
   }

   @FXML
   private void goToDashboard() throws IOException
   {
      if (LMS.isValidAccount(userName.getText(), password.getText()))
      {
         App.account = LMS.findAccount(userName.getText());
         App.setRoot("dashboard");
         App.account.display();
      }
      else
         App.playErrorAnimation(error);
   }
   
   @FXML
   private void goToCreateAccount() throws IOException
   {
      App.setRoot("createAccount");
   }
   
}
