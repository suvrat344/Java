// The program stores a list of Employee objects, each of which has name, department and salary as instance variables. A user can query the list to find the Employees who belong to a specific department and have salary greater than or equal to the input salary. Complete the program as specified.
// Define a class Employee as follows: 
// Add the instance variables to represent name, department and salary
// Implement the required constructor(s) and accessors.
// Override the method toString() so that the format of the output is in accordance with those in the test cases. 
// Define a function query that takes a list of employees, a department and a salary as input. It returns a stream comprising the Employee objects that have the same department and have salary greater and equal to the given salary.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.stream.*;

class Employee
{
  private String name;
  private String department;
  private double salary;

  public Employee(String name,String dept,double salary)
  {
    this.name = name;
    this.department = dept;
    this.salary = salary;
  }

  public String getName()
  {
    return this.name;
  }

  public String getDepartment()
  {
    return this.department;
  }

  public double getSalary()
  {
    return this.salary;
  }

  @Override
  public String toString()
  {
    return this.name + " : " + this.department + " : " + this.salary;
  }
}

public class p39FilterEmployee
{
   public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        var eList = new ArrayList<Employee>();
        eList.add(new Employee("Jack", "HR", 30000));
        eList.add(new Employee("Aria", "HR", 40000));
        eList.add(new Employee("Nora", "IT", 50000));
        eList.add(new Employee("Bella", "IT", 60000));
        eList.add(new Employee("Jacob", "IT", 70000));
        eList.add(new Employee("James", "HR", 80000));

        System.out.print("Enter department : ");
        String dept = sc.next();      

        System.out.print("Enter salary : ");
        double sal = sc.nextInt();
		
        var stu = query(eList, dept, sal);
        stu.forEach(n -> System.out.println(n + " "));
    }

    static Stream<Employee> query(List<Employee> emp,String dept,double sal)
    {
      Stream<Employee> st = emp.stream().filter(e -> e.getDepartment().equals(dept) && e.getSalary() > sal);
      return st;
    }
}

