// Write the Java code as instructed.
// • Class Faculty has the following members.
//    – String name, double salary as private instance variables
//    – Constructor to initialize the instance variables
//    – Method public double bonus(float percent) that returns the bonus computed as (percent/100.0)*salary
//    – You should define method getDetails() to display name and salary of an Faculty
//    – You should overload method getDetails() as getDetails(float percent) to display the name, salary and bonus of an Faculty
// • Class Hod extends class Faculty and has the following members.
//    – String personalAssistant as private instance variable
//    – Constructor to initialize the instance variables of Hod that includes the instance variables of Faculty
//    – You should override method public double bonus(float percent) that returns the bonus of a Hod as 50 percent less bonus than a regular faculty
//    – You should override method getDetails() to display the name, salary and personalAssistant of Hod.
//    – You should override method getDetails(float percent) to display the name,salary, personalAssistant and bonus of a Hod
// • Class p40Faculty has the main method and the following functionality.
//    – It creates objects of Faculty and Hod types, and also accepts the required input values.
// – Invokes methods getDetails() and getDetails(float percent) on Faculty and Hod objects.


class Faculty
{
  private  String name;
  private double salary;

  public Faculty(String name,double salary)
  {
    this.name = name;
    this.salary = salary;
  }

  public double bonus(float percent)
  {
    double bonus = (percent/100.0) * this.salary;
    return bonus;
  }

  public void getDetails()
  {
    System.out.println("Name : " + this.name);
    System.out.println("Salary : " + this.salary);
  }

  public void getDetails(float percent)
  {
    System.out.println("Name : " + this.name);
    System.out.println("Salary : " + this.salary);
    System.out.println("Bonus : " + bonus(percent));
  }
}


class Hod extends Faculty
{
  private String personalAssistant;

  public Hod(String name,double salary,String personalAssistant)
  {
    super(name,salary);
    this.personalAssistant = personalAssistant;
  }

  @Override
  public double bonus(float percent)
  {
    double bonus = super.bonus(10) * 0.5;
    return bonus;
  }

  @Override
  public void getDetails()
  {
    super.getDetails();
    System.out.println("Personal Assistant : " + this.personalAssistant);
  }

  @Override
  public void getDetails(float percent)
  {
    super.getDetails(percent);
    System.out.println("Personal Assistant : " + this.personalAssistant);
    System.out.println("Bonus : " + bonus(percent));
  }
}

public class p41Faculty
{
  public static void main(String[] args) 
  {
      Faculty f1 = new Faculty("Srihari",50000);
      Faculty f2 = new Hod("Vishnu",80000,"Laxmi");

      f1.getDetails();
      f1.getDetails(10);

      f2.getDetails();
      f2.getDetails(10);
  }
}

