// Naresh (aka Customer c1) buys a set of items from a shop. Suresh (aka Customer c2)also buys all items bought by Naresh except the first item, in place of which Sureshbuys another item. Write a program that defines two classes Items and Customer, and clones the object of class Customer to model the scenario given above. Classes Items and Customer should be cloneable, and must have the functionality to clone (deep copy) c2 from c1. You are given as input the number of items bought by Naresh, the names of the items, and the new item that Suresh will be buying. The code to change the first item and the name in the second customer object after the cloning, has been provided in the given code. You should complete the program as specified below.
// Define a class Items that implements interface Cloneable, and has the following members.
// – A public instance variable item of type String[] to store the item names
// – Constructor(s) and accessors to, respectively, initialize and access the instance variable
// – Override the method clone
// – Override the method toString so that the format of the output is in accordance with those in the test cases

// Define a class Customer that implements interface Cloneable, and has the following members.
// – Instance variable name of type String to store the name of the customer
// – Instance variable of type Items to store the items purchased by the customer
// – Implement the constructor(s), the accessor getItems() to return the object of Items, and the mutator setName(String s) to update the name of the customer.
// – Override the method clone
// – Override the method toString so that the format of the output is in accordance with those in the test cases.

import java.util.*;

class Items implements Cloneable
{
  public String[] item;

  public Items(String[] item)
  {
    this.item = item.clone();
  }

  public Items clone() throws CloneNotSupportedException
  {
    Items it = (Items) super.clone();
    it.item = (String[]) item.clone();
    return it;
  }

  @Override
  public String toString()
  {
    String s = "";
    for (int i = 0; i < item.length; i++) 
    {
        s  = s  + item[i] + " ";
    }
    return s;
  }
}


class Customer implements Cloneable
{
  private String name;
  Items item;

  public Customer(String name,Items item)
  {
    this.name = name;
    this.item = item;
  }

  public Customer clone() throws CloneNotSupportedException
  {
    Customer c = (Customer) super.clone();
    Items nitem = c.getItems().clone();
    c.item = nitem;
    return c;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public Items getItems()
  {
    return this.item;
  }

  @Override
  public String toString()
  {
    return this.name + " " + item;
  }
}


public class p40Order 
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number of items : ");
      int n = sc.nextInt();

      String[] itm = new String[n];
      for(int i = 0; i < n; i++)
      {
        System.out.print("Enter item : ");
        itm[i] = sc.next();
      } 
      var c1 = new Customer("naresh", new Items(itm));
      Customer c2 = c1.clone();  
      
      System.out.print("Enter name of item to be updated : ");
      c2.getItems().item[0] = sc.next();
      c2.setName("suresh");
      System.out.println(c1);
      System.out.println(c2);
    }
}   

