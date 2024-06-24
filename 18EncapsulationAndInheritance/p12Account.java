// Define a BankAccount class with private attributes like accountNumber, accountHolderName, and balance. Provide public methods to deposit and withdraw money, ensuring that these methods don't allow illegal operations like withdrawing more money than the current balance.

import java.util.Scanner;

class BankAccount
{
  private String accountNumber;
  private String accountHolderName;
  private float balance;

  public BankAccount(String AccountNumber,String AccountHolderName,float Balance)
  {
    this.accountNumber = AccountNumber;
    this.accountHolderName = AccountHolderName;
    this.balance = Balance;
  }

  public String getAccountNumber()
  {
    return this.accountNumber;
  }

  public String getAccountHolderName()
  {
    return this.accountHolderName;
  }
  
  public void deposit(float amount)
  {
    this.balance += amount;
  }

  public void withdraw(float amount)
  {
    if(this.balance - amount < 0)
    {
      System.out.println("Transaction failed");
    }
    else
    {
      this.balance -= amount;
    }
  }

  public void display()
  {
    System.out.println("\nAccount Details");
    System.out.println("Account Number : " + this.accountNumber);
    System.out.println("Account Holder Name : " + this.accountHolderName);
    System.out.println("Balance : " + this.balance);
  }
}


public class p12Account 
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter account number : ");
      String accountNumber = input.nextLine();

      System.out.print("Enter account holder name : ");
      String accountHolderName = input.nextLine();

      System.out.print("Enter account balance : ");
      float balance = input.nextFloat();

      BankAccount account = new BankAccount(accountNumber,accountHolderName,balance);
      
      account.display();
      account.deposit(1000);
      account.withdraw(2000);
      account.display();
  }
}