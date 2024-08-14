// Given a list of strings, use stream operations to filter out strings that have length of 10 or more and then concatenate the remaining strings

import java.util.*;

public class p13FilterAndConcatenateString
{
  public static void main(String[] args) 
  {
      List<String> arrString = new ArrayList<>();
      arrString.add("Hello how are you?");
      arrString.add("I am fine about you?");
      arrString.add("Cucumber");

      arrString.stream().filter(s-> s.length() > 10).forEach(s -> System.out.print(s));
  }
}
