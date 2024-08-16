// Complete the Java code below that takes a list of student objects as input, and removes students from the list that satisfy the defined property.
// Complete the program as specified below:
// • Class Student that has the following members:
//    – String name, double attendance as instance variable
//    – Constructor to initialize the name and attendance
//    – Override method toString() that returns name and attendance of the Student as a single concatenated string (each separated by a single space)
// • Class RemoveStudent that has the following members:
//    – Method public boolean property(double value), it returns true if value<65 otherwise return false.
//    – You should define method public void detained(ArrayList<Student> sList) that has the following functionality.
//        ∗ It iterates through the list object and invokes property(double value) on each student object.
//        ∗ If any student satisfies the condition given in the property() method, then remove the student object from the list, otherwise display the student object.
// • Class p48StudentAttendance has the following members:
//    – main method has the following functionality
//      ∗ Creates a list of 6 Student objects
//      ∗ Invokes method detained(list) from RemoveStudent class


import java.util.*;

class Student
{
  String name;
  double attendance;

  public Student(String name,double attendance)
  {
    this.name = name;
    this.attendance = attendance;
  }

  public String toString()
  {
    return this.name + ", " + this.attendance;
  }
}


class RemoveStudent
{
  public Boolean property(double value)
  {
    if(value < 65)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public void detained(List<Student> sList)
  {
    Iterator<Student> iter = sList.iterator();
    Student obj;
    while(iter.hasNext())
    {
      obj = iter.next();
      if(property(obj.attendance))
      {
        iter.remove();
      }
      else
      {
        System.out.println(obj);
      }
    }
  }
}


public class p49StudentAttendance 
{
  public static void main(String[] args) 
  {
      List<Student> stu = new ArrayList<>();

      stu.add(new Student("virat",23.0));
      stu.add(new Student("johny",78.9));
      stu.add(new Student("suchith",56.9));
      stu.add(new Student("juhee",45.00));
      stu.add(new Student("karthik",90.0));
      stu.add(new Student("shannu",67.0));

      RemoveStudent obj = new RemoveStudent();
      obj.detained(stu);
  }
}
