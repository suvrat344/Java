// A banking application has to handle multiple account transactions.
// Complete the following code using the logic of callbacks to achieve the desired output.
// Input: 
//     - An integer for number of transactions in total
//     - An array of integer inputs for the account number
//     > The number of transactions equals the number of account numbers input in the array, each account corresponds to one transaction
// Class Account:
//     - has static variable account_numbers which stores the array of account numbers
//     - static variable current_account_no that stores the number of account processed so far
//     - static variable new_account that stores the account object newly created 
//     - each transaction process makes a call to the next transaction, which inturn makes a callback to process it
// class Transaction:
//     - has static variable total_no_of_transactions that stores the input total number of transactions
//     - has static variable transaction_count that stores the total number of transactions processed so far
//     - NOTE: transaction numbers start from 1
//     - each transaction when made, makes a call to process it
// NOTE: transaction process prints the appropriate information about the process and the transaction when created(made) prints that the previous transaction was completed and then creates the new one.
// Test case : 
// Input:
// 3
// 1001
// 1002
// 1003
// Output:
// Transaction for account 1001 in process
// Transaction number 1 completed!
// Transaction 2 for account 1002 in process
// Transaction number 2 completed!
// Transaction 3 for account 1003 in process
// Transaction number 3 completed!


import java.util.Scanner;

class Account 
{
    public static int[] account_numbers;
    private static int current_account_no = 0;
    private static Account new_account;

    private Account() 
    {
        current_account_no++;
    }

    public static Account getAccount() 
    {
        new_account = new Account();
        return new_account;
    }

    public void firstTransaction() 
    {
        System.out.println("Transaction for account " + account_numbers[0] + " in process");
        Transaction.makeNextTransaction();
    }

    public void processTransaction() 
    {
       System.out.println("Transaction " + current_account_no + " for account " + account_numbers[current_account_no - 1] + " in process");
       Transaction.makeNextTransaction();
    }
}

class Transaction 
{
    public static int total_no_of_transactions; 
    private static int transaction_count = 1;

    public static void makeNextTransaction() 
    {
        System.out.println("Transaction number " + transaction_count + " get completed!");
        if(transaction_count < total_no_of_transactions)
        {
            transaction_count++;
            Account acc = Account.getAccount();
            acc.processTransaction();
        }
    }
}


public class p63BankingTrasaction 
{
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of transaction : ");
        Transaction.total_no_of_transactions = input.nextInt();
        
        Account.account_numbers = new int[Transaction.total_no_of_transactions];

        System.out.println("Enter account numbers:");
        for (int i = 0; i < Transaction.total_no_of_transactions; i++) 
        {
            Account.account_numbers[i] = input.nextInt();
        }

        Account a = Account.getAccount();
        a.firstTransaction();

        input.close();
    }
}
