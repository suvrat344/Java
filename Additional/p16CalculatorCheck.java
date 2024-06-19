import java.util.Scanner;

class Calculator
{
    public void sum(double a,double b)
    {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
    
    public void subtraction(double a,double b)
    {
        System.out.println(a + " - " + b + " = " + (a - b));
    }
    
    public void multiply(double a,double b)
    {
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    
    public void division(double a,double b)
    {
        System.out.println(a + " / " + b + " = " + (a / b));
    }
}
 

class UpdatedCalculator extends Calculator
{
    public void remainder(double n1,double n2)
    {
        System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
    }
} 


public class p16CalculatorCheck
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double n1 = input.nextDouble();

        System.out.print("Enter second number : ");
        double n2 = input.nextDouble();

        Calculator c = new Calculator();
        c.sum(n1,n2);
        c.subtraction(n1, n2);
        c.multiply(n1, n2);
        c.division(n1, n2);

        UpdatedCalculator uc = new UpdatedCalculator();
        uc.remainder(n1, n2);
    }
}