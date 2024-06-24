// Define a class Employee with private attributes (like name, age, and salary), public methods to get and set these attributes, and a package-private method to displayEmployeeDetails. Create another class in the same package to test access to the displayEmployeeDetails method

import java.util.Scanner;

class Employee
{
  private String name;
  private int age;
  private float salary;

  public Employee(String name,int age,float salary)
  {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getName()
  {
    return this.name;
  }

  public void setAge(int age)
  {
    this.age = age;
  }
  
  public int getAge()
  {
    return this.age;
  }

  public void setSalary(float salary)
  {
    this.salary = salary;
  }
  
  public float getSalary()
  {
    return this.salary;
  }

  void getEmployeeDetails()
  {
    System.out.println("\nEmployee Details");
    System.out.println("Name : " + this.name);
    System.out.println("Age : " + this.age);
    System.out.println("Salary : " + this.salary);
  }
}

public class p13Employee
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter name of the employee : ");
    String name = input.nextLine();

    System.out.print("Enter age of the employee : ");
    int age = input.nextInt();

    System.out.print("Enter salary of the employee : ");
    float salary = input.nextFloat();

    Employee e = new Employee(name,age,salary);
    e.setName(name);
    e.setAge(age);
    e.setSalary(salary);
    e.getEmployeeDetails();
  }
}
