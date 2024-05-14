package system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Course implements displayable
{
   private static int count ;
   private int id;
   private String title;
   private String description;
   private String[] content;
   private String catagory;
   private String difficulty;
   private LocalDate publishedDate;
   private Instructor instructor;
   private ArrayList<Student> enrolledStudents;
   private int price;
   private double avgRating;
   private int numberOfRatings;
   private int estimatedHours;
   private double CourseCompletionPercentage;
   private ArrayList<Quiz> quizzes;

   public Course(Instructor instructor, String title, String description, String[] content, String catagory, String difficulty, int price, int estimatedHours)
   {
      this.instructor = instructor;
      this.enrolledStudents = new ArrayList<>();
      this.title = title;
      this.description = description;
      this.content = content;
      this.catagory = catagory;
      this.difficulty = difficulty;
      this.price = price;
      this.estimatedHours = estimatedHours;
      this.publishedDate = LocalDate.now();
   }

   public Course()
   {  
      id = ++count;
      quizzes = new ArrayList<>();
   }

   public Course(String title, Instructor instructor, int price)
   {
      id = ++count;
      this.title = title;
      this.instructor = instructor;
      this.price = price;
      this.publishedDate = LocalDate.now();
   }

   public Course(Instructor instructor, String title, String description, int price, String difficulty)
   {
      id = ++count;
      this.title = title;
      this.instructor = instructor;
      this.price = price;
      this.description = description;
      this.difficulty = difficulty;
      this.publishedDate = LocalDate.now();
   }

   //Getters
   public String getTitle()
   {
      return this.title;
   }

   public String getDescription()
   {
      return description;
   }

   public String[] getContent()
   {
      return content;
   }

   public String getCatagory()
   {
      return catagory;
   }

   public String getDifficulty()
   {
      return difficulty;
   }

   public String getPublishedDate()
   {
      return publishedDate.toString();
   }

   public int getPrice()
   {
      return price;
   }

   public double getRating()
   {
      return avgRating;
   }

   public int getNumberOfStudents()
   {
      return enrolledStudents.size();
   }

   public int getEstimatedHours()
   {
      return estimatedHours;
   }

   public boolean isCourseFree()
   {
      return (price == 0);
   }
   //Setters

   public void setPrice(int price)
   {
      this.price = price;
   }

   // display
   public void displayInstrctors()
   {
      System.out.println("system.Course Instructors:" + instructor); // to_string method will be invoked.
   }

   @Override
   public void display()
   {  
      String s = "Course" + id + " {" + "title=" + title + ", description=" + description + ", instructor:"+instructor.getUserName() + ", price:"+price + ", Published date: " + getPublishedDate() + "}";
      System.out.println(s);

   }

   // other
   public void enroll(Student student)
   {
      enrolledStudents.add(student);
   }

   public boolean isEnrolled(Student student)
   {
      for (var enrolledStudent : enrolledStudents)
      {
         if (enrolledStudent.equals(student))
         {
            return true;
         }
      }
      return false;
   }

   public void updateRating(int rating)
   {
      double total = avgRating * numberOfRatings;
      numberOfRatings++;
      avgRating = (total + rating) / numberOfRatings;
   }

   public void addQuiz(Quiz quiz)
   {
      quizzes.add(quiz);
   }

   public void setTitle(String title)
   {
      this.title = title;
   }

   public void setInstructor(Instructor instructor)
   {
      this.instructor = instructor;
   }

   public Instructor getInstructor()
   {
      return instructor;
   }

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
      {
         return true;
      }
      if (obj == null)
      {
         return false;
      }
      if (getClass() != obj.getClass())
      {
         return false;
      }
      final Course other = (Course) obj;
      if (this.price != other.price)
      {
         return false;
      }
      if (Double.doubleToLongBits(this.avgRating) != Double.doubleToLongBits(other.avgRating))
      {
         return false;
      }
      if (this.numberOfRatings != other.numberOfRatings)
      {
         return false;
      }
      if (this.estimatedHours != other.estimatedHours)
      {
         return false;
      }
      if (Double.doubleToLongBits(this.CourseCompletionPercentage) != Double.doubleToLongBits(other.CourseCompletionPercentage))
      {
         return false;
      }
      if (!Objects.equals(this.title, other.title))
      {
         return false;
      }
      if (!Objects.equals(this.description, other.description))
      {
         return false;
      }
      if (!Objects.equals(this.catagory, other.catagory))
      {
         return false;
      }
      if (!Objects.equals(this.difficulty, other.difficulty))
      {
         return false;
      }
      if (!Arrays.deepEquals(this.content, other.content))
      {
         return false;
      }
      if (!Objects.equals(this.publishedDate, other.publishedDate))
      {
         return false;
      }
      if (!Objects.equals(this.instructor, other.instructor))
      {
         return false;
      }
      if (!Objects.equals(this.enrolledStudents, other.enrolledStudents))
      {
         return false;
      }
      return Objects.equals(this.quizzes, other.quizzes);
   }

   @Override
   public String toString()
   {
      return "Course{" + "title=" + title + ", description=" + description + ", content=" + content + ", catagory="
              + catagory + ", difficulty=" + difficulty + ", publishedDate=" + publishedDate
              + ", instructor=" + instructor + ", enrolledStudents=" + enrolledStudents
              + ", price=" + price + ", avgRating=" + avgRating + ", numberOfRatings=" + numberOfRatings
              + ", estimatedHours=" + estimatedHours + ", CourseCompletionPercentage=" + CourseCompletionPercentage
              + ", quizzes=" + quizzes + '}';
   }

}
