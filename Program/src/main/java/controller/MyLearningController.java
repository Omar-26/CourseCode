/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import system.Course;
import system.Instructor;
import system.LMS;
import system.PriceComparator;
import system.Student;

/**
 * FXML Controller class
 *
 * @author A.Ashraf
 */
public class MyLearningController implements Initializable
{

   @FXML
   private TextField CourseDes;

   @FXML
   private TextField CoursePrice;

   @FXML
   private Label PriceLabel3;

   @FXML
   private Button addCourseB;

   @FXML
   private VBox cardLayout;

   @FXML
   private TextField courseTitle;

   @FXML
   private TilePane coursesPane;

   @FXML
   private ToggleGroup diffcuilty;

   @FXML
   private ToggleGroup diffcuilty1;

   @FXML
   private ToggleGroup diffcuilty2;

   @FXML
   private ScrollPane scrollPaneLayout;

   @FXML
   private VBox addCourseBox;

   @FXML
   private Button createB;

   /**
    * Initializes the controller class.
    */
   @Override
   public void initialize(URL url, ResourceBundle rb)
   {
      scrollPaneLayout.setVisible(true);
      addCourseBox.setVisible(false);
      if (App.account instanceof Instructor)
      {
         addCourseB.setVisible(true);
      }
      for (var course : LMS.getCourses())
      {
         addCard(course);
      }
   }

   @FXML
   public void goToSetting() throws IOException
   {
      App.setRoot("setting");
   }

   @FXML
   public void goToLogin() throws IOException
   {
      App.setRoot("login");
   }

   @FXML
   public void goToDashboard() throws IOException
   {
      App.setRoot("dashboard");
   }

   @FXML
   private void sortCourses()
   {
      ObservableList<Node> boxes = coursesPane.getChildren();
      List<Node> boxesList = new ArrayList<>(boxes);
      PriceComparator sortingCondition = new PriceComparator();
      Collections.sort(boxesList, sortingCondition );
      coursesPane.getChildren().clear();
      coursesPane.getChildren().addAll(boxesList);
   }

   public void addCard(Course course)
   {
      FXMLLoader fxmlLoader = new FXMLLoader();
      fxmlLoader.setLocation(getClass().getResource("card.fxml"));
      try
      {
         VBox cardBox = fxmlLoader.load();
         CardController cardLayout = fxmlLoader.getController();
         cardLayout.setData(course);
         coursesPane.getChildren().add(cardBox);
      }
      catch (IOException ex)
      {
         ex.printStackTrace();
      }
   }

   @FXML
   void AddCourse()
   {
      scrollPaneLayout.setVisible(false);
      addCourseBox.setVisible(true);
   }

   @FXML
   void courseDiffculity()
   {

   }

   @FXML
   void createCourseAction() throws IOException
   {
      Instructor currentInstructor = (Instructor)App.account;
      currentInstructor.createCourse(courseTitle.getText(), CourseDes.getText(), "beginner", Integer.parseInt(CoursePrice.getText()));
      App.setRoot("mylearning");
   }
}
