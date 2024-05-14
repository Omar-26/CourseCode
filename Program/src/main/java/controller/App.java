package controller;

import javafx.animation.Transition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;
import java.util.ArrayList;
import javafx.animation.FadeTransition;
import static javafx.application.Application.launch;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import system.Account;
import system.Course;
import system.LMS;
import system.SystemTest;
import system.displayable;

/**
 * JavaFX App
 */
public class App extends Application
{

   private static Scene page;
   private static Stage window;
   static Account account;
   static Course course;

   static void setRoot(String fxml) throws IOException
   {
      page = new Scene(loadFXML(fxml));
      window.setScene(page);
      window.centerOnScreen();
      window.show();
//    window.initStyle(StageStyle.TRANSPARENT);
//    page.setFill(Color.TRANSPARENT);
//    return window;
   }

   @Override
   public void start(Stage stage) throws IOException
   {
      window = stage;
      page = new Scene(loadFXML("login"));
      window.setScene(page);
      window.show();
      window.setOnCloseRequest(eh -> {
         System.out.println("Our system Logs:");
         System.out.println("\nAccounts:-");
         displayInfo(LMS.getAccounts());
         System.out.println("\nCourses:-");
         displayInfo(LMS.getCourses());
      });
   }
   
   private void displayInfo(ArrayList< ? extends displayable>objects)
   {
      for (var obj : objects)
         obj.display();
   }
   
   private static Parent loadFXML(String fxml) throws IOException
   {
      FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
      return fxmlLoader.load();
   }

   static void playErrorAnimation(Node n)
   {
      FadeTransition ft1 = new FadeTransition(Duration.seconds(5), n);
      n.setVisible(true);
      ft1.setFromValue(1.0);
      ft1.setToValue(0);
      ft1.play();
   }
   
   
   public static void main(String[] args)
   {
      SystemTest.TestGUI();
      launch(args);
   }


}
