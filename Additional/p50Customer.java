// Write a Java program that takes as input 4 Customer objects and the list of Customer objects with attributes customer name, and expense. The program computes the discount amount payable to each customer (assuming discount rate is 5% of the expense value, and is applicable for all customers having expense value >= 1000) and prints the discount amount in the format given in sample input-output. For customers who are not eligible for discount, it prints Nondiscountable expense. Complete the program as specified below:
// • Define a checked exception (extends Exception) DiscountException that returns the string Nondiscountable expense if getMessage method of DiscountException is called.
// • Define class Customer, which should have the following members:
//    – Instance variables – name and expense
//    – final variable – discountrate is
//    – a suitable constructor to initialize the instance variables
//    – accessors getName() to obtain the value of name
//    – method checkDiscount() that computes the discount amount if the expense is >= 1000; otherwise, throws DiscountException.
// • Class ExceptionTest has the main method and the method displayCustomers.In function displayCustomers, invokes the checkDiscount() on each customer object.


import java.util.LinkedList;

class DiscountException extends Exception
{
    public DiscountException()
    {
        super("Nondiscountable expense");
    }
}


class Customer
{
    private String name;
    private double expense;
    final double discountrate = 0.05;

    public Customer(String name,double expense)
    {
        this.name = name;
        this.expense = expense;
    }

    public String getName()
    {
        return this.name;
    }

    public double checkDiscount() throws DiscountException
    {
        if(expense < 1000)
        {
            throw new DiscountException();
        }
        return discountrate * this.expense;

    }
}


public class p50Customer
{
    static void displayCustomers(LinkedList<Customer> cus)
    {
        for(Customer customer : cus)
        {
            System.out.print(customer.getName() + " ");
            try
            {
                System.out.println(customer.checkDiscount());
            }
            catch(DiscountException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args)
    {
        var cus = new LinkedList<Customer>();
        cus.add(new Customer("Jack",700));
        cus.add(new Customer("Adam",100));
        cus.add(new Customer("Jose",1100));
        cus.add(new Customer("Raja",1900));

        displayCustomers(cus);
    }
}