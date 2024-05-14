package system;

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
         new Student("user1", "user1 fullname", "1111", "user1@gmail.com", 2500, 21),
         new Student("user2", "user2 fullname", "2222", "user2@gmail.com", 2500, 21),
         new Student("user3", "user3 fullname", "3333", "user3@gmail.com", 2500, 21),
         new Student("user4", "user4 fullname", "4444", "user4@gmail.com", 2500, 21),
         new Instructor("user5", "user5 fullname", "5555", "user5@gmail.com", 2500, 21)
      };
      for (var newAccount : newAccounts)
      {
         LMS.createAccount(newAccount);
      }

      Course[] newCourses =
      {
         new Course("CS50", new Instructor("AHmed2s", "1234", "dasdsd", "Ahmed Ashraf"), 30),
         new Course("CS50", new Instructor("AHmed2s", "1234", "dasdsd", "Ahmed Ashraf"), 70),
         new Course("CS50", new Instructor("AHmed2s", "1234", "dasdsd", "Ahmed Ashraf"), 40),
         new Course("CS50", new Instructor("AHmed2s", "1234", "dasdsd", "Ahmed Ashraf"), 50),
         new Course("Data Structure", new Instructor("UC San Diego", "1234", "dasdsd", "Ahmed Ashraf"), 100)
      };

      for (var course : newCourses)
      {
         LMS.addCourse(course);
      }

   }
}
