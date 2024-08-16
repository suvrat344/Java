// Write a Java program that accepts list of student objects and updates the regular fees, based on the number of backlogs that each student has.
// • An interface Generatable that has the following member:
//    – Abstract method abstract void feeGenerate(Student s)
// • Class Student that has the following members:
//    – String name, double fee and int backlogs as private instance variable.
//    – Constructor to initialize the name and backlogs.
//    – Mutator method to update the fee
//    – Accessor method to access the backlogs
//    – Override method toString() that returns name, fee and backlogs of the
//      Student as a single concatenated string (each separated by comma(,))
// • Class ExamBranch that has the following members:
//    – A private inner class Regular that implements the interface Generatable and overrides method public void feeGenerate(Student s) that, in turn, initializes the regular student fee as 1500.
//    – A private inner class Supple that implements the interface Generatable and overrides method public void feeGenerate(Student s) that, in turn, has the following functionality.
//    ∗ If the student backlogs == 1, then update the student fee to 2000.
//    ∗ Else, if the student backlogs == 2, then update the student fee to 2500.
//    ∗ Else, if the student backlogs >= 3, then update the student fee to 3500.
//    – You should define method getRegularFee() that returns an object of Regular class.
//    – You should define method getSuppleFee() that returns an object of Supple class.
// • Class PrivateClassTest has the following members:
//    – You should define method public static Student[] getStudentsFee(StudentsList[]) that does the following:
//    ∗ Iterates over array sList such that in each iteration, invoke method feeGenerate(Student s) on each Student object from Regular class, if student backlogs == 0. Else, invoke method feeGenerate(Student s) on each Student object from Supple class.
//    – main method has the following functionality
//    ∗ Creates and initializes an array sArr of three Student objects
//    ∗ Invokes method getStudentsFee(sArr) to get the updated details of each Student after the fee is updated
//    ∗ Prints the updated list

import java.util.Scanner;

abstract interface Generatable
{
  abstract void feeGenerate(Student s);
}


class Student
{
  private String name;
  private double fee;
  private int backlogs;

  public Student(String name,int backlogs)
  {
    this.name = name;
    this.backlogs = backlogs;
  }

  public void setFee(double fee)
  {
    this.fee = fee;
  }

  public int getBacklogs()
  {
    return this.backlogs;
  }

  @Override
  public String toString()
  {
    return this.name+", "+this.fee+", "+this.backlogs;
  }
}


class ExamBranch
{
  private class Regular implements Generatable
  {
    @Override
    public void feeGenerate(Student s)
    {
      s.setFee(1500.00);
    }
  }

  private class Supple implements Generatable
  {
    @Override
    public void feeGenerate(Student s)
    {
      if(s.getBacklogs() == 1)
      {
        s.setFee(2000.00);
      }
      else if(s.getBacklogs() == 2)
      {
        s.setFee(2500);
      }
      else
      {
        s.setFee(3500.00);
      }
    }
  }

  public Generatable getRegularFee()
  {
    return new Regular();
  }

  public Generatable getSuppleFee()
  {
    return new Supple();
  }
}


public class p46StudentFee
{
  public static Student[] getStudentsFee(Student[] sList)
  {
    for (Student element : sList) 
    {
      if(element.getBacklogs() == 0)
      {
        ExamBranch obj = new ExamBranch();
        obj.getRegularFee().feeGenerate(element);
      }
      else
      {
        ExamBranch obj = new ExamBranch();
        obj.getSuppleFee().feeGenerate(element);
      }
    }
    return sList;
  }

  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    Student[] sArr = new Student[3];

    for (int i = 0; i < sArr.length; i++) 
    {
        sArr[i] = new Student(input.next(),input.nextInt());
    }
    sArr = getStudentsFee(sArr);

    for(Student obj : sArr)
    {
        System.out.println(obj);
    }
  }
}
