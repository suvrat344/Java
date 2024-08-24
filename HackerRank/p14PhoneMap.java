// You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.
// Input Format
// The first line will have an integer n denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.
// After these, there will be some queries. Each query will contain a person's name.

import java.util.*;

public class p14PhoneMap 
{
  public static void main(String[] args) 
  {
    Map<String,String> phoneDirectory = new HashMap<>();
    phoneDirectory.put("uncle sam", "99912222");
    phoneDirectory.put("tom","11122222");
    phoneDirectory.put("harry","12299933");

    Scanner input = new Scanner(System.in);

    while(input.hasNext())
    {
      String name = input.nextLine();
      if(phoneDirectory.containsKey(name))
      {
        System.out.println(name + "=" + phoneDirectory.get(name));
      }
      else
      {
        System.out.println("Not found");
      }
    } 
  }
}
