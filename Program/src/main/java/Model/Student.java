package model;

import java.util.ArrayList;

public class Student extends Account
{
   private ArrayList <Course> enrolledCourses ;
   public Student(String userName, String fullName, String password, String email, double credit, int age)
   {
      super(userName, fullName, password, email, credit, age);
      enrolledCourses = new ArrayList<>();
   }

   public Student(String userName, String password, String email)
   {
      super(userName, password, email);
      enrolledCourses = new ArrayList<>();

   }

   public Student(String userName, String password, String email, String fullname)
   {
      super(userName, password, email, fullname);
      enrolledCourses = new ArrayList<>();

   }

   public void enrollCourse(Course course)
   {
      enrolledCourses.add(course);
   }
   
   @Override
   public void display()
   {
      System.out.println("Instructor" + " {" + super.toString() + "}");
   }
}
