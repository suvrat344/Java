// Create a Map where the keys are country names (as String) and the values are their capitals (also String). Populate the map with at least five countries and their capitals. Write a program that prompts the user to enter a country name and then displays the corresponding capital, if it exists in the map

import java.util.*;

public class p20CountryWithCapital
{
  public static void main(String[] args) 
  {
      Map<String,String> m = new HashMap<>();
      m.put("India","New Delhi");
      m.put("USA","Washington DC");
      m.put("Sri Lanka","Colombo");
      m.put("Australia","Canberra");
      m.put("New Zealand","Wellington");

      System.out.println(m);
      System.out.println("Capital of India is " + m.get("India"));
      for(Map.Entry<String,String> entry : m.entrySet())
      {
        System.out.println(entry.getKey() + " : " + entry.getValue());
      }
  }
}
