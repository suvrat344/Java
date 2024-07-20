// Write a program that sorts a list of String objects in descending order using a custom Comparator

import java.util.*;

public class p12StringSort
{
  public static void main(String[] args)
  {
    List<String> str = new ArrayList<> ();
    str.add("New");
    str.add("Zebra");
    str.add("List");
    System.out.println("List Before Sorting : " + str);
    Collections.sort(str,new java.util.Comparator<String>() {
      @Override
      public int compare(String s,String t1)
      {
        if(s.equals(t1))
        {
          return 0;
        }
        else if(s.charAt(0) < t1.charAt(0))
        {
          return 1;
        }
        else
        {
          return -1;
        }
      }
    });
    System.out.print("List After Sorting : " + str);
  }
}