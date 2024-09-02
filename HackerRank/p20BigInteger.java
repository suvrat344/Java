// In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.
// Use the power of Java's BigInteger class and solve this problem.
// Input Format
// There will be two lines containing two numbers, a and b.
// Output Format
// Output two lines. The first line should contain a+b, and the second line should contain aXb. Don't print any leading zeros.
// Sample Input
// 1234
// 20
// Sample Output
// 1254
// 24680


import java.math.BigInteger;
import java.util.*;

public class p20BigInteger
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        String a = input.next();
        
        System.out.print("Enter second number : ");
        String b = input.next();

        BigInteger first = new BigInteger(a);
        BigInteger second = new BigInteger(b);

        BigInteger sum = first.add(second);
        BigInteger product = first.multiply(second);

        System.out.println("Sum of two number : " + sum);
        System.out.println("Product of two number : " + product);
    }
}