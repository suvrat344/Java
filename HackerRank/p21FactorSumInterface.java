// You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). You need to write a class called MyCalculator which implements the interface.
// divisorSum function just takes an integer as input and return the sum of all its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.
// Read the partially completed code in the editor and complete it. You just need to write the MyCalculator class only. Your class shouldn't be public.
// Sample Input
// 6
// Sample Output
// I implemented: AdvancedArithmetic
// 12


import java.util.*;
interface AdvancedArithmetic
{
  int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic
{
  int sum = 0;

  @Override
  public int divisor_sum(int num)
  {
    for(int i = 1;i <= num;i++)
    {
      if(num % i == 0)
      {
        sum += i;
      }
    }
    return sum;
  }
}


public class p21FactorSumInterface
{
    public static void main(String []args)
    {
        MyCalculator my_calculator = new MyCalculator();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();

        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	input.close();
    }

    static void ImplementedInterfaceNames(Object o)
    {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++)
        {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

