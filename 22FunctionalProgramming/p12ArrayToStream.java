// Convert an array of strings into a stream. Then, use the stream to print each string to the console

import java.util.*;
import java.util.stream.Stream;

public class p12ArrayToStream
{
  public static void main(String[] args) 
  {
      List<String> arr = new ArrayList<>();
      arr.add("Mango");
      arr.add("Banana");
      arr.add("Litchi");
      
      Stream<String> fruits = arr.stream();
      fruits.forEach(s -> System.out.println(s));
  }
}