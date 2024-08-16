// Write Java code as instructed.
// • Define an interface Appraisable that has the following members:
//    – Default method default void appraisal(Teacher t) that increments the salary of an Employee by (stuPassPer/100)*5000.
//    – Abstract method public abstract void checkAndUpdateSalary()
// • Define an interface SpecialAppraisable that extends Appraisable and has the following members:
//    – Default method default void spAppraisal(Teacher t) that increments the salary of an Employee by (stuPassPer/100)*10000.
// • Class Teacher that implements the interface SpecialAppraisable and has the following members:
//    – String name, double salary and private double stuPassPer as private instance variables
//    – Constructor to initialize the instance variables
//    – Mutator method to update salary
//    – Accessor method to access salary
//    – Accessor method to access stuPassPer
//    – Override method toString() that returns name, salary and stuPassPer of the Teacher as a single concatenated string (each separated by a single space)
//    – Overriding method public void checkAndUpdateSalary() that has the following functionality.
//      ∗ If stuPassPer>=60 and stuPassPer<75 then invoke the appraisal() method from Appraisable interface
//      ∗ Else, if stuPassPer>=75 and stuPassPer<=100 then invoke thespAppraisal() method from SpecialAppraisable interface
// • Class p44Appraisal that has the following members:
//    – You should define method public static void printUpdatedTeachList(Teacher[]tList) that has the following functionality
//      ∗ Iterate over array tList and invoke method checkAndUpdateSalary() on each Teacher object.
//      ∗ Then, iterate over tList and display each Teacher object.
//    – main method has the following functionality
//      ∗ Creates and initializes an array tArr of three Teacher objects
//      ∗ Invokes method printUpdatedTeachList(Teacher[] tList) to print the updated details of each Teacher after the appraisal is applied  


import java.util.Scanner;

abstract interface Appraisable
{
  default void appraisal(Teacher t)
  {
    t.setSalary(t.getSalary() + (t.getStuPassPer() / 100) * 5000);
  }
  abstract public void checkAndUpdateSalary();
}

interface SpecialAppraisable extends Appraisable
{
  default void spAppraisal(Teacher t)
  {
    t.setSalary(t.getSalary() + (t.getStuPassPer() / 100) * 10000);
  }
}


class Teacher implements SpecialAppraisable
{
  String name;
  double salary;
  private double stuPassPer;

  public Teacher(String name,double salary,double stuPassPer)
  {
    this.name = name;
    this.salary = salary;
    this.stuPassPer = stuPassPer;
  }

  public double getSalary()
  {
    return this.salary;
  }

  public void setSalary(double s1)
  {
    this.salary = this.salary + s1;
  }

  public double getStuPassPer()
  {
    return this.stuPassPer;
  }

  @Override
  public void checkAndUpdateSalary()
  {
    if(this.stuPassPer >= 60 && this.stuPassPer < 75)
    {
      appraisal(this);
    }
    else if(this.stuPassPer >= 75 && this.stuPassPer <= 100)
    {
      spAppraisal(this);
    }
  }

  @Override public String toString()
  {
    return this.name+" "+this.salary+" "+this.stuPassPer;
  }
}


public class p45Appraisal
{
  public static void printUpdatedTeachList(Teacher[] tList)
  {
    for (Teacher obj : tList) 
    {
      obj.checkAndUpdateSalary();
    }

    for (Teacher obj : tList) 
    {
      System.out.println(obj);
    }
  }
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    Teacher []tArr = new Teacher[3];
    for(int i = 0;i < tArr.length;i++)
    {
      tArr[i] = new Teacher(input.next(),input.nextDouble(),input.nextDouble());
    }
    printUpdatedTeachList(tArr);
  }
}

