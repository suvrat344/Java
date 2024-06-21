// Create an object with final fields and a constructor to initialize them.

import java.util.Scanner;

class School
{
  final int maxEnrollmentStudent;
  final int maxEnrollmentTeacher;

  public School(int maxEnrollmentStudent,int maxEnrollmentTeacher)
  {
    this.maxEnrollmentStudent = maxEnrollmentStudent;
    this.maxEnrollmentTeacher = maxEnrollmentTeacher;
  }

  public void display()
  {
    System.out.println("Maximum Enrollment of Student : " + maxEnrollmentStudent);
    System.out.println("Maximum Enrollment of Teacher : " + maxEnrollmentTeacher);
  }
}

public class p34FinalConstructor 
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);

      System.out.print("Maximum enrollment of students in school : ");
      int maxEnrollmentStudent = input.nextInt();

      System.out.print("Maximum enrollment of teachers in school : ");
      int maxEnrollmentTeacher = input.nextInt();

      School s1 = new School(maxEnrollmentStudent,maxEnrollmentTeacher);
      s1.display();
  }
}
