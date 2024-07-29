// Write a Java code that takes as input a positive number (length of an array here), and two arrays of that length - one of integers and another of strings. The code must also take an integer and a String as input, and print the number of occurrences of the integer and the string in the integer array and the string array, respectively.
// Format of input:
// Length of the arrays
// Elements in the integer array (in separate lines)
// Element to count in the integer array
// Elements in the string array (in separate lines)
// Element to count in the string array
// Variables used in the code: 
// len - represents length of array
// s1 - represents an element to be counted for in Integer array 
// s2 - represents an element to be counted for in String array 


import java.util.*;

class ArrayExample <T>
{
  T[] a;
  
  public ArrayExample(T[] x)
  {
    this.a = x;
  }

  public void display()
  {
    for (T t : a) 
    {
      System.out.print(t + " ");
    }
    System.out.println();
  }

  public int elementCount(T x)
  {
    int counter = 0;

    if(x instanceof Integer)
    {
      for (T t : a) 
      {
        if(t.equals(x))
        {
          counter++;
        }
      }
    }
    else
    {
      for (T t : a) 
      {
        if(t.equals(x))
        {
          counter++;
        }
      }
    }
    return counter;
  }
}


public class p28ArrayObject
{
  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter length of an integer array : ");
    int len = input.nextInt();

    System.out.println("Enter element you want to enter");
    Integer[] x = new Integer[len];
    for(int i = 0; i < len; i++)
    {
          x[i] = input.nextInt();
    }

    ArrayExample<Integer> obj = new ArrayExample<>(x);
    System.out.print("Enter value to be counted : ");
    int s1 = input.nextInt();


    String[] y = new String[len];
    System.out.println("Enter element you want to enter");
    for(int i = 0; i < len; i++)
    {
          y[i] = input.next();
    }
    
    ArrayExample<String> obj1 = new ArrayExample<>(y);
    System.out.print("Enter element to be searched : ");
    String s2 = input.next();
    
    obj.display();
    System.out.println(obj.elementCount(s1));
    obj1.display();
    System.out.println(obj1.elementCount(s2));
  }
}
