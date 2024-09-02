// Given below is a class called Bills which stores details of a customer's purchase. 
// Define the missing constructor and the copy constructor as expected by the program below.
// The instance variable discount is static and the discountedAmt is defined in the constructor using the billAmt and discount, as expected by the output
// Complete the code in accordance with the test cases provided
// Test case1 
// Input:
// Pranav
// 1500
// Output:
// 1350.0
// Name : Pranav
// Bill Amount : 1500
// Discounted Amount : 1350.0
// Items : Apples : Oranges : Guava :
// Test case2
// Input:
// Karthik
// 1245
// Output:
// 1120.5
// Name : Karthik
// Bill Amount : 1245
// Discounted Amount : 1120.5
// Items : Apples : Oranges : Guava :


import java.util.*;

class Bills{
    static double discount = 0.1;
    private String name;
    private String[] items;
    private int billAmt;
    private double discountedAmt;

    public Bills(String name,int billAmt,String[] items)
    {
        this.name = name;
        this.billAmt = billAmt;
        this.items = items;
        this.discountedAmt = this.billAmt * (1 - Bills.discount);
    }

    public Bills(Bills obj)
    {
        this.name = obj.name;
        this.billAmt = obj.billAmt;
        this.items = (String[]) obj.items.clone();
        this.discountedAmt = obj.discountedAmt;

        // Alternative Approach
        // int len = obj.items.length;
        // this.items = new String[len];
        // for(int i = 0;i < len;i++)
        // {
        //     this.items[i] = obj.items[i];
        // }
    }

    public String getName()
    {
        return this.name;
    }

    public double getDiscountAmt()
    {
        return this.discountedAmt;
    }

    public void changeItem(int index,String itemName)
    {
        this.items[index] = itemName;
    }

    public void printBill()
    {
        System.out.print("\nName : "+this.name + "\nBill Amount : " + this.billAmt + "\nDiscounted Amount : " + this.discountedAmt + "\nItems : ");
        for(String ele : items)
        {
            System.out.print(ele + " : ");
        }
    }
}


public class p59Bills
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String items[] = {"Apples", "Oranges", "Guava"};
        System.out.print("Enter name : ");
        String name = input.nextLine();
        System.out.print("Enter bill amount : ");
        int billAmt = input.nextInt();

        Bills b1 = new Bills(name, billAmt, items);
        Bills b2 = new Bills(b1);
        b2.changeItem(0,"Banana");

        System.out.println(b2.getDiscountAmt());
        b2.printBill();
        input.close();
    }
}