package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ResultController implements Initializable
{

   @FXML
   Label correctText;
   @FXML
   Label wrongText;
   @FXML
   Label marks;
   @FXML
   Label totalScore;
   @FXML
   Label passOrFail;

   @Override
   public void initialize(URL url, ResourceBundle rb)
   {
      totalScore.setText("Total Score is");
//      correctText.setText("Correct Answers : " + String.valueOf(myQuizController.correct));
//      wrongText.setText("Wrong Answers : " + String.valueOf(myQuizController.wrong));
      marks.setText( String.valueOf(myQuizController.correct) +"/3");
      myQuizController.correct = 0;
      if (passOrFail())
      {
         passOrFail.setText("Congratulations you have passed");
      }
      else
      {
         passOrFail.setText("You have to try again");
      }
   }

   boolean passOrFail()
   {
      return myQuizController.correct > myQuizController.wrong;
   }

   @FXML
   private void endQuiz() throws IOException
   {
      App.setRoot("dashboard");
   }
   
}
