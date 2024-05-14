package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;
import system.Course;
import system.Quiz;


public class myQuizController
{

   Quiz quiz = new Quiz();
   Course course = new Course();

   @FXML
   Label question;
   @FXML
   Button opt1, opt2, opt3, opt4;
   int counter = 0;
   static int correct = 0;
   static int wrong = 0;

   @FXML
   private void initialize()
   {
      loadQuestions();
   }
   
   private void showQuestions(String que, String ...op)
   {
      quiz.addQuestion(que);
      quiz.addOptions(op);
      question.setText(quiz.getQuestion(counter));
      opt1.setText(quiz.getOption(counter,0));
      opt2.setText(quiz.getOption(counter,1));
      opt3.setText(quiz.getOption(counter,2));
      opt4.setText(quiz.getOption(counter,3));
      course.addQuiz(quiz);
   }

   private void loadQuestions()
   {

      if (counter == 0)
      {
         showQuestions("1] The data structure required for Breadth First Traversal on a graph is?", "Array","Stack","Tree","Queue");
      }
      else if (counter == 1)
      {
         showQuestions("2] Which data structure is used for implementing recursion?" +
                 "a) Stack\n", "Array","Stack","List","Queue");
      }
      else if (counter == 2)
      {
         showQuestions("3] Which data structure is based on the Last In First Out (LIFO) principle?", "Tree", "Linked List", "Stack", "Queue");
      }
      App.course = course ;
   }

   private boolean checkAnswer(String answer)
   {
      if (counter == 0)
      {
         if (Objects.equals(answer, quiz.getOption(counter,0)))
         {
            return true;
         }
         else
         {
            return false;
         }
      }
      else if (counter == 1)
      {
         if (Objects.equals(answer, quiz.getOption(counter,0)))
         {
            return true;
         }
         else
         {
            return false;
         }
      }
      else if (counter == 2)
      {
         if (Objects.equals(answer, quiz.getOption(counter,0)))
         {
            return true;
         }
         else
         {
            return false;
         }
      }
      return false;
   }

   @FXML
   private void opt1Clicked(ActionEvent event) throws IOException
   {
      if (checkAnswer(opt1.getText()))
      {
         correct += 1;
      }
      else
      {
         wrong += 1;
      }

      if (counter == 2)
      {
         App.setRoot("result");
      }
      else
      {
         counter++;
         loadQuestions();
      }
   }

   @FXML
   private void opt2Clicked(ActionEvent event) throws IOException
   {
      if (checkAnswer(opt2.getText()))
      {
         correct += 1;
      }
      else
      {
         wrong += 1;
      }

      if (counter == 2)
      {
         App.setRoot("result");
      }
      else
      {
         counter++;
         loadQuestions();
      }
   }

   @FXML
   private void opt3Clicked(ActionEvent event) throws IOException
   {
      if (checkAnswer(opt3.getText()))
      {
         correct += 1;
      }
      else
      {
         wrong += 1;
      }

      if (counter == 2)
      {
         App.setRoot("result");
      }
      else
      {
         counter++;
         loadQuestions();
      }
   }

   @FXML
   private void opt4Clicked(ActionEvent event) throws IOException
   {
      if (checkAnswer(opt4.getText()))
      {
         correct += 1;
      }
      else
      {
         wrong += 1;
      }

      if (counter == 2)
      {
         App.setRoot("result");
      }
      else
      {
         counter++;
         loadQuestions();
      }
   }
}
