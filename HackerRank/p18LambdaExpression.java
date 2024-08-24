// Write the following methods that return a lambda expression performing a specified action:
// PerformOperation isOdd(): The lambda expression must return true if a number is odd or false if it is even.
// PerformOperation isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
// PerformOperation isPalindrome(): The lambda expression must return true if a number is a palindrome or false if it is not.
// Input Format
// Input is handled for you by the locked stub code in your editor.
// Output Format
// The locked stub code in your editor will print  lines of output.


import java.io.*;
import java.util.*;

interface PerformOperation 
{
 boolean check(int a);
}

class MyMath 
{
 public static boolean checker(PerformOperation p, int num) 
 {
  return p.check(num);
 }

  public PerformOperation isOdd()
  {
    return (int a) -> a % 2 == 1;
  }

  public PerformOperation isPrime()
  {
    return (int a) -> 
    {
      if(a < 2)
      {
        return false;
      }
      for (int i = 2; i < Math.sqrt(a); i++) 
      {
          if(a % i == 0)
          {
            return false;
          }
      }
      return true;
    };
  }

  public PerformOperation isPalindrome()
  {
    return (int a) -> 
    {
      int num = a,rev=0;
      while(num > 0)
      {
        rev = num % 10 + rev * 10;
        num = num / 10;
      }
        return a == rev;
    };
  }
}


public class p18LambdaExpression
{
 @SuppressWarnings("static-access")
public static void main(String[] args) throws IOException 
 {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;

  while (T--> 0) 
  {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());

      switch (ch) {
          case 1 -> {
              op = ob.isOdd();
              ret = ob.checker(op, num);
              ans = (ret) ? "ODD" : "EVEN";
          }
          case 2 -> {
              op = ob.isPrime();
              ret = ob.checker(op, num);
              ans = (ret) ? "PRIME" : "COMPOSITE";
          }
          case 3 -> {
              op = ob.isPalindrome();
              ret = ob.checker(op, num);
              ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
          }
          default -> {
          }
      }
   System.out.println(ans);
  }
 }
}
