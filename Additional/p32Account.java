// The program should accept account opening requests in the following format:
// Number of savings accounts to be opened
// The account number  acc_no and balance of each savings account 
// Number of current accounts to be opened
// The account number, balance and over draft limit of each current account
// All the requests are forwarded to the accountProcessor method which, in turn, validates the requests, and prints the details according to the following criteria.
// Each valid account should have a unique account number. In case there are multiple account requests with the same account number, only the first request should be processed, and the rest should be discarded.
// Hint: Use the  LinkedHashSet collection, and override the equals and hashCode methods to achieve this feature. The methods equals and hashCode are defined inside the Object class.	
// Once all the duplicate account requests are filtered out and unique valid accounts are opened, the program should print the details of all the valid accounts in descending order of balance.
// Hint: Use the  TreeSet collection, and override the compareTo method to achieve this feature. The method compareTo is declared inside the Comparable interface.


import java.util.*;

abstract class Account implements Comparable<Account>
{
    String acc_no;
    double balance;	
    public Account(String no,double bal)
    {
        this.acc_no = no; 
        this.balance = bal;
    }	

    @Override
    public int compareTo(Account other)
    {
        if(this.balance != other.balance)
        {
            return Double.compare(other.balance,this.balance);
        }
        return this.acc_no.compareTo(other.acc_no);
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        Account account = (Account) obj;
        return Objects.equals(acc_no,account.acc_no);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(acc_no);
    }
}

class SavingsAccount extends Account
{
    public SavingsAccount(String acc_no, double bal) 
    {
        super(acc_no,bal);
    }
    
    @Override
    public String toString()
    {
        return "Savings Account:" + this.acc_no + " ," + "Balance:" + this.balance;
    }
}


class CurrentAccount extends Account
{
    double overdraft_limit;

    public CurrentAccount(String acc_no, double bal, double odl) 
    {
        super(acc_no,bal);
        this.overdraft_limit = odl;
    }

    @Override
    public String toString()
    {
        return "Current Account:" + this.acc_no + " ," + "Balance:" + this.balance;
    }
}

public class p32Account
{
    static void accountProcessor(ArrayList<Account> acc)
    {
        LinkedHashSet<Account> unique_account = new LinkedHashSet<>(acc);
        TreeSet<Account> sorted_account = new TreeSet<>(unique_account);

        for(Account account : sorted_account)
        {
            System.out.println(account);
        }
    }

    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Account> acc = new ArrayList<>();
        
        System.out.print("Enter number of saving account : ");
        int s_acc_count = input.nextInt();

        for(int i=1;i<=s_acc_count;i++) 
        {
            System.out.print("Enter saving account number : ");
            String no = input.next();

            System.out.print("Enter account balance : ");
            double bal = input.nextDouble();
            acc.add(new SavingsAccount(no,bal));
        }
        
        System.out.print("Enter number of current account : ");
        int c_acc_count = input.nextInt();

        for(int i=1;i<=c_acc_count;i++) 
        {
            System.out.print("Enter account number : ");
            String no = input.next();

            System.out.print("Enter current account balance : ");
            double bal = input.nextDouble();
            
            System.out.print("Enter overdraft limit : ");
            double lim = input.nextDouble();
            acc.add(new CurrentAccount(no,bal,lim));
        }
        
        accountProcessor(acc);
    }
}
