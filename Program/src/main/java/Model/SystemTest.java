package model;

public class SystemTest
{

   public static void testLMS()
   {
      Account[] newAccounts =
      {
         new Student("user1", "user1a", "43656", "user1@gmail.com", 2500, 21),
      //new Instructor("user2"),
      // new Instructor("user3"),
      //new Student("user4")
      };

      // test adding accounts to the LMS.
      for (var newAccount : newAccounts)
      {
         LMS.createAccount(newAccount);
      }

      // test displaying students and instructors accounts on the LMS.
      LMS lms = new LMS();
      lms.display();
      lms.display();

      // test deleting account from the LMS.
      lms.deleteAccount(newAccounts[0]);
      lms.display();
   }

   public static void TestGUI()
   {
      Account[] newAccounts =
      {
              new Student("student1", "student1 fullname", "s1111", "student1@gmail.com", 2500, 21),
              new Student("student2", "student2 fullname", "s2222", "student2@gmail.com", 7500, 21),
              new Instructor("instructor1", "Mr Omar", "i1111", "instructor1@gmail.com", 45200, 42)
      };
      for (var newAccount : newAccounts)
      {
         LMS.createAccount(newAccount);
      }

      Course[] newCourses =
      {
              new Course("Data Structures", new Instructor("UC San Diego", "1234", "dasdsd", "UC San Diego"), 30),
              new Course("Algorithmic Toolbox", new Instructor("UC San Diego", "1234", "dasdsd", "UC San Diego"), 70),
              new Course("Java Programming and Software Engineering", new Instructor("Duke University", "1234", "dasdsd", "Duke University"), 40),
              new Course("Machine Learning Specialization", new Instructor("Andrew Ng", "1234", "dasdsd", "Andrew Ng"), 50),
              new Course("Deep Learning Specialization", new Instructor("Andrew Ng", "1234", "dasdsd", "Andrew Ng"), 100),
              new Course("Python for Everybody Specialization", new Instructor("University of Michigan", "1234", "dasdsd", "University of Michigan"), 80)
      };

      for (var course : newCourses)
      {
         LMS.addCourse(course);
      }

   }
}
