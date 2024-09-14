// In a college, Student s1 chooses a set of courses. Student s2 also chooses all the courses chosen by s1 except the second course, in place of which s2 chooses another course. Write a program that defines two classes Student and Admission. Define copy constructor to create s2 from s1 such that changing the values of instance variables of either s2 or s1 does not affect the other one. The code takes name of student s2 and the new course chosen by s2 as input.
// • Class Student has/should have the following members.– Private instance variables String name and String[] courses to store name and courses chosen respectively– Define required constructor(s)– Accessor methods getName() and getCourses(int) to get the name of the student and the course at a specific index respectively.– Mutator methods setName(String) and setCourses(int,String) to set the name of the student and the course at a specific index respectively.
// • Class Admission has method main that does the following.– Two objects of Student s1 and s2 are created. s2 is created using s1– name of Student s2 and second course chosen by s2 are updated by taking the input– Finally, name of s1, s2 and second course chosen by s1 and s2 are printed.
// What you have to do
// • Define constructor(s) in class Student
// Test cases:
// Public test case 1:
// Input:
// Suba COA
// Output:
// Nandu: DL
// Suba: COA


class Student
{
  String name;
  String[] courses;

  public Student(String name,String[] courses)
  {
    this.name = name;
    this.courses = courses;
  }

  public Student(Student obj)
  {
    this.name = obj.name;
    int len = obj.courses.length;
    this.courses = new String[len];
    for(int i = 0;i < len;i++)
    {
      this.courses[i] = obj.courses[i];
    }
  }

  public void setName(String name) 
  {
    this.name = name;
  }
  public void setCourses(int indx, String c) 
  {
    courses[indx] = c;
  }
  public String getName() 
  {
    return this.name;
  }
  public String getCourses(int indx) 
  {
    return this.courses[indx];
  }
}


public class p68Admission 
{
  public static void main(String[] args) 
  {
    String[] courses = {"Maths", "DL","DSA","DC"};
    Student s1 = new Student("Nandu", courses);
    Student s2 = new Student(s1);
    s2.setName("Suba");
    s2.setCourses(1,"COA");
    System.out.println(s1.getName() + ": "+ s1.getCourses(1));
    System.out.println(s2.getName() + ": " + s2.getCourses(1));
  }
}