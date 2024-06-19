// Design a Course class.
// • Instance variables: courseName, enrolledStudents.
// • Static variable: maxCapacity, the maximum number of students for any course.
// • Instance methods: enrollStudent(String studentName), unenrollStudent(String studentName).
// • Static method: setMaxCapacity(int capacity), to set the maximum capacity for courses.


class Course
{
  private String CourseName;
  private int enrollment;
  private static int maxCapacity = 100;
  String[] enrolledStudent;


  public Course(String CourseName)
  {
    this.CourseName = CourseName;
    this.enrollment = 0;
    this.enrolledStudent = new String[maxCapacity];
  }

  public void enrollStudent(String studentName)
  {
    this.enrolledStudent[enrollment] = studentName;
    enrollment++;
  }

  public void unenrollStudent(String studentName)
  {
    System.out.println("Student removed");
    enrollment--;
  }
}


public class p12Course
{
  public static void main(String[] args) 
  {
      Course c1 = new Course("Physics");
      c1.enrollStudent("Ajay");
  }
}