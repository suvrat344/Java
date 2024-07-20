// Write a program that takes a string and returns the number of unique characters using a Set

import java.util.*;

public class p17Unique 
{
  public static void main(String[] args) 
  {
    String s = "Hello World";
    Set<Character> unique = new HashSet<>();

    for(char element : s.toCharArray()) 
    {
      unique.add(element);
    }
    System.out.println("Number of unique character : " + unique.size());
  }
}
