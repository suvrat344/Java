// Create BankAccount class that has the following instance variables and methods:
// Instance variables:
//     accountNumber
//     name
//     balance
//     final variable: minBalance
// Private method:
//     checkMinBalance(amount) - returns false if balance - amount <= minBalance else returns true

// Public methods:

//     balance( ) - prints the balance
//     deposit(amount) - updates balance = balance + amount
//     withdraw(amount) - calls the checkMinBalance(amount) method,
//                                     if it returns true update balance = balance - amount else prints Transaction failed

import java.util.Scanner;

class BankAccount
{
    public int accountNumber;
    public String name;
    public int balance;
    final int minBalance = 100;

    private boolean checkMinBalance(int amount)
    {
        if(balance - amount <= minBalance)
        {
            return false;
        }
        else
        {
          return true;
        }
    }
    
    public BankAccount(int accountNumber,String name,int balance)
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
    
    public void balance()
    {
        System.out.println(this.balance);
    }
    
    public void deposit(int amount)
    {
        this.balance = this.balance + amount;
    }
    
    public void withdraw(int amount)
    {
        if(checkMinBalance(amount))
        {
            this.balance = this.balance - amount;
        }
        else
        {
            System.out.println("Transaction failed");
        }
    }
}


public class p20AccountCheck
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount : ");
        int amnt = input.nextInt( );

        System.out.print("Enter amount : ");
        int amnt1 = input.nextInt( );

        BankAccount b = new BankAccount(1890, "rahul", 1000);
        b.deposit(amnt);
        b.balance();
        b.withdraw(amnt1);
        b.balance();
    }
}
