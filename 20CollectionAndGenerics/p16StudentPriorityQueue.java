// Create a PriorityQueue of a custom class Student with attributes name and grade. Use a comparator to order by grade.

import java.util.*;

class Student
{
  String name;
  char grade;

  public Student(String name,char grade)
  {
    this.name = name;
    this.grade = grade;
  }

  public String getName()
  {
    return this.name;
  }

  public char getGrade()
  {
    return this.grade;
  }

  public String toString()
  {
    return this.name + " " + this.grade;
  }
}

public class p16StudentPriorityQueue
{
  public static void main(String[] args) 
  {
      PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<>() {
        @Override
        public int compare(Student s,Student t)
        {
          return s.getGrade() - t.getGrade();
        }
      });

      queue.offer(new Student("Anuj",'A'));
      queue.offer(new Student("Ram",'B'));
      queue.offer(new Student("Shyam",'E'));
      queue.offer(new Student("Mohan",'C'));
      queue.offer(new Student("Rohan",'D'));

      System.out.println("Queue is : " + queue);
      System.out.println(queue.poll());
      System.out.println(queue.poll());
      System.out.println(queue.poll());
      System.out.println(queue.poll());
      System.out.println(queue.poll());
  }
}