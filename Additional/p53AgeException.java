// Complete the Java code to raise an exception when the input age is either lower than the age to vote or is higher than the age to appear for UPSC exams or both.
// Class InvalidAgeException is a user-defined exception.
// Class AgeExceptionTest has the following members:
//    • Static method isEligibletoVote(int age) that takes an age (as a int value) and returns true if age >= 18.
//    • Static method isEligibletoWriteUPSC(int age) that takes an age (as a int value) and returns true if age <= 32.
// If age < 18 then the method should throw InvalidAgeException printing the message: Invalid age to vote. Else, if age > 32, then the method should throw InvalidAgeException printing the message Invalid age to write UPSC.
// • main method that takes as input an age, invokes methods to check if a person of that age is eligible to vote, and invokes another method to see if the person is eligible to
// write the UPSC exams. If both are satisified, then it prints Eligible to vote and to write UPSC.
// What you have to do:
// • Define a user-defined exception: InvalidAgeException
// • Define method isEligibletoVote inside class InputExceptionTest
// • Define method isEligibletoWriteUPSC inside class InputExceptionTest

class InvalidAgeException extends Exception
{
  public InvalidAgeException(String message)
  {
    super(message);
  }
}

public class p53AgeException
{
  static boolean isEligibletoVote(int age) throws InvalidAgeException
  {
    if(age >= 18)
    {
      return true;
    }
    throw new InvalidAgeException("Invalid age to vote");
  }

  static boolean isEligibletoWriteUPSC(int age) throws InvalidAgeException
  {
    if(age <= 32)
    {
      return true;
    }
    throw new InvalidAgeException("Invalid age to write UPSC");
  }

  public static void main(String[] args) 
  {
    int age = 18;
    try
    {
      isEligibletoVote(age);
      isEligibletoWriteUPSC(age);
      System.out.println("Eligible to vote and to write UPSC");
    }
    catch(InvalidAgeException ie)
    {
      System.out.println(ie.getMessage());
    }
  }
}
