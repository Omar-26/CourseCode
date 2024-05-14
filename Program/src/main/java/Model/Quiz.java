package system;

import java.util.ArrayList;
import java.util.Objects;

public class Quiz implements displayable
{

   private double grade;
   private ArrayList<String> questions;
   private ArrayList<String[]> options;
   static int quizNumber = 1;

   public Quiz()
   {
      questions = new ArrayList<>();
      options = new ArrayList<>();
   }

   void passOrFail(int grade)
   {
      double totalMark = 10;
      if (grade >= 0.7 * totalMark)
      {
         System.out.println("Pass with grade : " + grade);
      }
      else
      {
         System.out.println("Fail with grade : " + grade);
      }
   }

   public double getGrade()
   {
      return grade;
   }

   public void setQuestion(String question, int questionNum)
   {
      questions.set(questionNum, question);
   }

   public String getQuestion(int questionNum)
   {
      return questions.get(questionNum);
   }

   public void setOptions(String[] options, int questionNum)
   {
      this.options.set(questionNum, options);
   }

   public String getOption(int questionNum, int optionNum)
   {
      return options.get(questionNum)[optionNum];
   }

   public void addQuestion(String question)
   {
      questions.add(question);
   }

   public void addOptions(String[] option)
   {
      options.add(option);
   }

   @Override
   public String toString()
   {
      return "Quiz" + quizNumber++ + "{"
              + "grade=" + grade
              + '}';
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
      {
         return true;
      }
      if (o == null || getClass() != o.getClass())
      {
         return false;
      }
      Quiz quiz = (Quiz) o;
      return Double.compare(grade, quiz.grade) == 0;
   }

   @Override
   public void display()
   {
      System.out.println(this);
   }
}
