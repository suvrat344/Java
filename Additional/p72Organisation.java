//  Write a Java program that,given as input name and salary of a number of employees,creates an array of Employee objects and prints the bonus of employees.Complete the program as specified below.
// •Abstract class Employee has the following members:
//  –Private instance variables String name and double salary
//  – Constructor to initialize the instance variables
//  – Accessor method for salary, name
//  – Abstract method public abstract void printBonus()
// • Classes Manager and Director should be defined in such a way that any object of Manager or Director can be assigned to a reference variable of type Employee.
//  – Class Manager should have constructor to initialize the instance variables. For an object of Manager, method printBonus should print the name of employee followed by his/her bonus.The bonus for a Manager is 10% of the salary.The accessor method getSalary() in Employee class returns the current salary.
//  – Class Director should have constructor to initialize the instance variables. For an object of Director, method printBonus should print the name of employee followed by his/her bonus.The bonus for a Director is 15% of the salary.The accessor method getSalary() in Employee class returns the current salary.
// • Class p72Organisation has the following members:
// – Method main accepts the name, salary of a Manager object followed by that of a
// Director object and stores the objects in an Employee array, and then invokes the method printBonus for each object in the array
// What you have to do
// • Define subclasses Manager and Director
// Input:
// Ashok 30000.00
// Swaraj 40000.00
// Output:
// Ashok : 3000.0
// Swaraj : 6000.0


abstract class Employee 
{
  private String name;
  private double salary;
  public Employee(String name, double salary) 
  {
    this.name = name;
    this.salary = salary;
  }
  public double getSalary() 
  {
    return this.salary;
  }
  public String getName() 
  {
    return this.name;
  }

  public abstract void printBonus();
}


class Manager extends Employee
{
  public Manager(String name,double salary)
  {
    super(name,salary);
  }


  public void printBonus()
  {
    double bonus = .1 * this.getSalary();
    System.out.println(this.getName() + " : " + bonus);
  }
}


class Director extends Employee
{
  public Director(String name,double salary)
  {
    super(name, salary);
  }

  public void printBonus()
  {
    double bonus = .15 * this.getSalary();
    System.out.println(this.getName() + " : " + bonus);
  }
}

public class p72Organisation 
{
  public static void main(String[] args) 
  {
  Employee[] eArr = new Employee[2];
  eArr[0] = new Manager("Ashok", 30000.00);
  eArr[1] = new Director("Swaraj", 40000.00);
  eArr[0].printBonus();
  eArr[1].printBonus();
  }
}
