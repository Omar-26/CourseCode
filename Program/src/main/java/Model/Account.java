package model;

import java.util.InputMismatchException;
import java.util.Objects;

public abstract class Account implements displayable
{

   private static int count;
   private int id;
   private String userName;
   private String password;
   private String fullName;
   private String email;
   private double credit;
   private int age;

   public Account(String userName, String fullName, String password, String email, double credit, int age)
   {
      id = ++count;
      this.userName = userName;
      this.fullName = fullName;
      this.password = password;
      this.email = email;
      this.credit = credit;
      this.age = age;
   }

   public Account(String userName, String password, String email)
   {
      id = ++count;
      this.userName = userName;
      this.password = password;
      this.email = email;
   }

   public Account(String userName, String password, String email, String fullname)
   {
      this(userName, password, email);
      this.fullName = fullname;
   }

   public String getUserName()
   {
      return this.userName;
   }

   public String getPassword()
   {
      return this.password;
   }

   public String getFullName()
   {
      return fullName;
   }

   public String getEmail()
   {
      return email;
   }

   public double getCredit()
   {
      return credit;
   }

   public int getAge()
   {
      return age;
   }

   public int getId()
   {
      return id;
   }
     
   public void setUserName(String userName)
   {
      this.userName = userName;

   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public void setFullName(String fullName)
   {
      try
      {

         this.fullName = fullName;

      }
      catch (InputMismatchException e)
      {

         System.out.println("InputMismatchException");

      }
   }

   public void setPassword(String password)
   {
      this.password = password;
   }

   public void setAge(int age)
   {
      if (age < 0)
      {
         throw new IllegalArgumentException("Input cannot be negative.");
      }
      try
      {

         this.age = age;

      }
      catch (InputMismatchException e)
      {

         System.out.println("InputMismatchException");

      }

   }

   public void setCredit(double credit)
   {
      if (credit < 0)
      {
         throw new IllegalArgumentException("Input cannot be negative.");
      }
      try
      {
         this.credit = credit;
      }
      catch (InputMismatchException e)
      {
         System.out.println("InputMismatchException");
      }
   }

   @Override
   public void display()
   {
      System.out.println(this);

   }

   @Override
   public String toString()
   {
      return "userName=" + userName + ", password=" + password + ", fullName=" + fullName + ", email="
              + email + ", credit=" + credit + ", age=" + age ;
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
      final Account other = (Account) obj;
      if (Double.doubleToLongBits(this.credit) != Double.doubleToLongBits(other.credit))
      {
         return false;
      }
      if (this.age != other.age)
      {
         return false;
      }
      if (!Objects.equals(this.userName, other.userName))
      {
         return false;
      }
      if (!Objects.equals(this.password, other.password))
      {
         return false;
      }
      if (!Objects.equals(this.fullName, other.fullName))
      {
         return false;
      }
      return Objects.equals(this.email, other.email);
   }

}
