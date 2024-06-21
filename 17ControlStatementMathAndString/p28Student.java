// Define a Student class with fields like name and age, and use toString to print student details

import java.util.Scanner;

class Student
{
  private String name;
  private int age;

  public Student(String name,int age)
  {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString()
  {
    return "Student{" + 
            "name : " + this.name + 
            "; age : " + this.age +
            "}";
  }
}


public class p28Student
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter name : ");
      String name = input.next();

      System.out.print("Enter age : ");
      int age = input.nextInt();

      Student s1 = new Student(name,age);
      System.out.print(s1.toString());
  }
}