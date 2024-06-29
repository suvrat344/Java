// In a class Calculator, create multiple add() methods that overload each other and can sum two integers, three integers, or two doubles. Demonstrate how each can be called with different numbers of parameters


class Calculator
{
  public int add(int a,int b)
  {
    return a + b;
  }

  public int add(int a,int b,int c)
  {
    return a + b + c;
  }

  public double add(double a,double b)
  {
    return a + b;
  }
}


public class p13Calculator
{
  public static void main(String[] args)
  {
    Calculator calc = new Calculator();
    System.out.println(calc.add(4,9));
    System.out.println(calc.add(2,7,14));
    System.out.println(calc.add(4.7,5.9));
  }
}
