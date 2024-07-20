//Add your code for ComplexNum here
// Given as input two integers n_1,n_2 and two double values d_1,d_2 complete the Java code to form two complex numbers c_1 and c_2, as described below, and print their sum.
// The real parts of c_1 and c_2 are n_1 and d_1 respectively, whereas their imaginary parts are n_2 and d_2, respectively.
// Define a generic class ComplexNum with the following members.
// Instance variables r and i
// A constructor to initialize r and i	
// A method add()to return the sum of the two instances of generic type ComplexNum
// A method that overrides the toString() method in the Object class so that the format of the output is in accordance with those in the test cases.

import java.util.*;

class ComplexNum <T extends Number>
{
    private T r;
    private T i;

    public ComplexNum(T r,T i)
    {
        this.r = r;
        this.i = i;
    }
    public ComplexNum<Double> add(ComplexNum<? extends Number> other)
    {
        double real = this.r.doubleValue() + other.r.doubleValue();
        double imaginary = this.i.doubleValue() + other.i.doubleValue();
        return new ComplexNum<>(real,imaginary);
    }
    
    @Override
    public String toString()
    {
        String real = formatNumber(r);
        String imag = formatNumber(i);
        return real + " + " + imag+"i";
    }
    
    public String formatNumber(T number)
    {
        if (number instanceof Integer) 
        {
            return String.format("%.1f", number.doubleValue());
        } 
        else
        {
            return number.toString();
        }
    }
}

public class p27Complex
{
public static void main(String[] args) 
{
        Scanner input = new Scanner(System.in);
        int n1, n2;
        double d1, d2;

        System.out.print("Enter first integer : ");
        n1 = input.nextInt();
        System.out.print("Enter second integer : ");
        n2 = input.nextInt();
        System.out.print("Enter first double : ");
        d1 = input.nextDouble();
        System.out.print("Enter seccond double : ");
        d2 = input.nextDouble();
        ComplexNum<Integer> c1 = new ComplexNum<>(n1,n2);
        ComplexNum<Double> c2 = new ComplexNum<>(d1,d2);
        ComplexNum<Double> c3 = c1.add(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
    }
}
