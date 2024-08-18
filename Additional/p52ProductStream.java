// Write a Java program that, given as input name, price and stock quantity of some products, prints the filtered stream of products that have price greater than 5000.00 and stock quantity more than 10. Complete the program as specified below.
// • Class Product has/should have the following members:
//    – Private instance variables String name, double price and int stockQuantity
//    – A constructor to initialize instance variables
//    – Method toString to print in the format shown in the test cases
//    – Accessor method for price and stockQuantity
//    – Method productProcessor should take an ArrayList of Product objects as input and returns a filtered stream of premium products with sufficient stock. The criteria for filtering are:
//      ∗ The price of the product is greater than 5000.00
//      ∗ The stock quantity of the product is greater than 10
// • Class p52ProductStream has the following members:
//    – Method main creates an ArrayList of Product objects by taking input in the order name, price, stockQuantity then invokes the method productProcessor to filter premium products with sufficient stock and then display those products
// What you have to do
// • Define method productProcessor in class Product


import java.util.*;
import java.util.stream.*;


class Product 
{
  private String name;
  private double price;
  private int stockQuantity;

  public Product(String name, double price, int stockQuantity) 
  {
    this.name = name;
    this.price = price;
    this.stockQuantity = stockQuantity;
  }

  @Override
  public String toString() 
  {
    return this.name + " - " + this.price + " - In Stock: " + this.stockQuantity;
  }


  public double getPrice() 
  {
    return this.price;
  }

  public int getStockQuantity() 
  {
    return this.stockQuantity;
  }

  public static Stream<Product> productProcessor(ArrayList<Product> prod)
  {
    return prod.stream().filter(p -> p.price > 5000 && p.stockQuantity > 10);
  }
}



public class p52ProductStream 
{
  public static void main(String[] args) 
  {
    ArrayList<Product> products = new ArrayList<>();
 
    Product product1 = new Product("Laptop",32000.0,15);
    Product product2 = new Product("Smartphone",8000.0,20);
    Product product3 = new Product("Smartwatch",300.0,12);
    Product product4 = new Product("TV",100000.0,8);
    products.add(product1);
    products.add(product2);
    products.add(product3);
    products.add(product4);
    
    Stream<Product> filteredStream = Product.productProcessor(products);
    System.out.println("Premium Products with Sufficient Stock:");
    filteredStream.forEach(System.out::println);

  }
}