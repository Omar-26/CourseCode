package model;

import java.util.ArrayList;

public class Instructor extends Account
{
   private ArrayList <Course> taughtCourses ;
   public Instructor(String userName, String fullName, String password, String email, double credit, int age)
   {
      super(userName, fullName, password, email, credit, age);
      taughtCourses = new ArrayList<>();
   }

   public Instructor(String userName, String password, String email)
   {
      super(userName, password, email);
      taughtCourses = new ArrayList<>();
   }

   public Instructor(String userName, String password, String email, String fullname)
   {
      super(userName, password, email, fullname);
      taughtCourses = new ArrayList<>();
   }

   // this method should create course then add the course to the system.
   // use course class constrcutor
   public void createCourse(String title, String description, String difficulty, int price)
   {
      Course course = new Course(this, title, description, price, difficulty);
      LMS.addCourse(course);
      taughtCourses.add(course);
   }
   @Override
   public void display()
   {
      System.out.println("Instructor" + " {" + super.toString() + "}");
   }
}
