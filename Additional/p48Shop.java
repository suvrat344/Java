
import java.net.http.WebSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Write a Java program that takes as input 4 Shop objects and the list of Shop objects with attributes shop name, and number of items sold nsold. The program should add each customer name as key and number of items as value to the map object. After all objects to the map, display the shop name which has sold maximum number of items as shown in the test cases. Complete the program as specified below:
// • Class Shop that has the following members:
//    – String name, int nsold as private instance variable
//    – Constructor to initialize the name and nsold
//    – Accessor methods to all instance variables
// • Class p47Shop has the following members:
//    – You should define method public static void printShopName(ArrayList<Shop>sList) that does the following:
//    ∗ Iterates over array sList such that in each iteration, add each customer name as key and number of items as value to the map object.
//    ∗ Print the shop name which has sold maximum number of items.
//    – main method has the following functionality
//    ∗ Creates a list of 4 Shop objects.
//    ∗ Invokes method printShopName(list) to print the shop name which has sold maximum number of items.


class Shop
{
  String name;
  int nsold;

  public Shop(String name, int nsold) 
  {
    this.name = name;
    this.nsold = nsold;
  }

  public String getName()
  {
    return this.name;
  }

  public int getItemSold()
  {
    return this.nsold;
  }
}

public class p48Shop
{
  static void printShopName(List<Shop> sList)
  {
    Map<String,Integer> m = new TreeMap<>();
    String shop = "";
    int sold = 0;

    for (Shop s : sList) 
    {
      m.put(s.getName(),m.getOrDefault(s.getName(),0)+s.getItemSold());
      for(Map.Entry<String,Integer> entry : m.entrySet())
      {
        if(entry.getValue() > sold)
        {
          shop = entry.getKey();
          sold = entry.getValue();
        }
      }
    }
    System.out.println(shop+" : "+sold);
  }
  public static void main(String[] args)
  {
    List<Shop> list = new ArrayList<>();

    list.add(new Shop("Orion",45));
    list.add(new Shop("Ambience",115));
    list.add(new Shop("Orion",45));
    list.add(new Shop("Orion",10));

    printShopName(list);
  }
}