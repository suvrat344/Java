// Recall that Java throws an ArithmeticException if there is an attempt to divide by zero. Similar to this, we can generate an exception if there is a division by three. Given two integers as input, complete the Java code given below to generate such an exception. 
// Create a class DivisionException that extends the class Exception.
// Override the toString() method to return "Division by 3 is not allowed".
// In the class Test, define divide(int a, int b) to return a/b, if the value of b is not equal to 3. If the value of b is 3, then throw an instance of DivisionException.
// Inside the method main(), invoke divide(x, y), and handle any possible exception by printing the said message.


import java.util.*;

class DivisionException extends Exception
{
    @Override
    public String toString()
    {
        return "Division by 3 is not allowed";
    }
}


public class p35Exception
{
    static int divide(int a,int b) throws DivisionException
    {
        if(b == 3)
        {
            throw (new DivisionException());
        }   
        return a/b;
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter value of x : ");
       int x = input.nextInt();
       System.out.print("Enter value of y : ");
       int y = input.nextInt();
       
        try
        {
            System.out.println(divide(x,y));
        }
        catch(DivisionException e)
        {
            System.out.println(e);
        }
   }
} 

