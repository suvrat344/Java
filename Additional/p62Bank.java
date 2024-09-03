// A bank has two types of accounts - Type_1 and Type_2
// Implement the same as instructed below :
//     - The bank has an Interface called accountDetails
//         > Methods : getAccHolder, getAccNo, getBalance
//         > it also has a default method called getInterestRate which returns 4.5  
//     - The bank has an Abstract class called Account
//         > Methods (abstract): deposit(double Amount), withdraw(double Amount)
//         > Methods (concrete): cautionMessage which prints "If action not performed by you, inform bank immediately!" 
    // - Type_1
    //     > It has an instance variable 'Rate' that is fixed as 4.67 and cannot be changed 
    //     > Implement the accessor methods from the Interface
    //     > Implement the deposit and withdraw method from the class Account
    //     > The 'getInterestRate' has to be redefined so as to return the fixed interest rate for Type_1
    //     > The deposit method allows the action to be performed only if the Amount is greater than or equal to 1000
    //     > On success it prints "Amount deposited successfully!" else "Insufficient funds to deposit! Deposit unsuccessful"
    //     > The withdraw method allows the action to be performed only if the Amount is feasible with the available Balance
    //     > On success it prints "Withdraw successful" else "Insufficient funds! Withdraw unsuccessful"
    //     > Both deposit and withdraw call the cautionMessage once the action is complete
    // - Type_2
    //     > It doesn't have a specific interest Rate, uses the default definition provided by the Interface
    //     > Implement the accessor methods from the Interface
    //     > Implement the deposit and withdraw method from the class Account
    //     > The deposit method allows the action to be performed irrespective of the Amount
    //     > On success it prints "Amount deposited successfully!"
    //     > The withdraw method allows the action to be performed only if the Amount is feasible with the available Balance
    //     > It also puts a limit to the amount withdrawn as 20000 ( 20k not included in limit)
    //     > On success it prints "Withdraw successful" else when the limit is exceeded "Fund requested exceeds limit! Withdraw unsuccessful" 
    //         or else when the amount is not feasible with the avaiable balance "Insufficient funds! Withdraw unsuccessful"
    //     > Both deposit and withdraw call the cautionMessage once the action is complete


interface accountDetails
{
    public abstract int getAcc_No();
    public abstract String getAccHolder();
    public abstract double getBalance();
    
    public default double getInterestRate()
    {
        return 4.5;
    }
}


abstract class Account
{
    abstract void deposit(double amount);
    abstract void withdraw(double amount);  
    
    public void cautionedMessage()
    {
        System.out.println("If action not performed by you, inform bank immediately!");
    }
}                                                                                                                                                     

class Type_1 extends Account implements accountDetails{
    private int Acc_No;
    private String Acc_Holder;
    private double Balance;
    private static final double rate = 4.67;

    public Type_1(int Acc_No, String Name, double Balance)
    {
        this.Acc_No = Acc_No;
        this.Acc_Holder = Name;
        this.Balance = Balance;
    }
    
    @Override
    public int getAcc_No()
    {
        return this.Acc_No;
    }

    @Override
    public String getAccHolder()
    {
        return this.Acc_Holder;
    }
    
    @Override
    public double getBalance()
    {
        return this.Balance;
    }

    @Override
    public double getInterestRate()
    {
        return rate;
    }

    @Override
    public void deposit(double amount)
    {
        if(this.Balance > 1000)
        {
            this.Balance += amount;
            System.out.println("Amount deposited successfully!");
        }
        else
        {
            System.out.println("Insufficient funds to deposit! Deposit unsuccessful");
        }
        cautionedMessage();
    }
                                                                                                                    @Override                 
    public void withdraw(double amount)
    {
        if (this.Balance > amount) 
        {
            this.Balance -= amount;
            System.out.println("Withdraw successful");
        }
        else
        {
            System.out.println("Insufficient funds! Withdraw unsuccessful");
        }
        cautionedMessage();
    }
}


class Type_2 extends Account implements accountDetails
{
    private int Acc_No;
    private String Acc_Holder;
    private double Balance;

    public Type_2(int Acc_No, String Name, double Balance)
    {
        this.Acc_No = Acc_No;
        this.Acc_Holder = Name;
        this.Balance = Balance;
    }
                 
    @Override
    public int getAcc_No()
    {
        return this.Acc_No;
    } 

    @Override
    public String getAccHolder()
    {
        return this.Acc_Holder;
    }

    @Override
    public double getBalance()
    {
        return this.Balance;
    }
    
    @Override
    public void deposit(double amount)
    {
        this.Balance += amount;
        System.out.println("Amount deposited successfully!");
        cautionedMessage();
    }
                
    @Override
    public void withdraw(double amount)
    {
        if(amount > 20000)
        {
            System.out.println("Fund requested exceeds limit! Withdraw unsuccessful");
        }
        else if(this.Balance > amount && amount < 20000)
        {
            this.Balance -= amount;
            System.out.println("Withdraw successful");
        }  
        else
        {
            System.out.println("Insufficient funds! Withdraw unsuccessful");
        }
        cautionedMessage();                                         
    }
}


public class p62Bank 
{
    public static void main(String args[])
    {
        Type_1 a1 = new Type_1(1002001, "Rahul", 35000);
        System.out.println(a1.getAccHolder() + "'s transactions");
        a1.deposit(500);
        a1.withdraw(10000);
        a1.deposit(2500);
        a1.withdraw(40000);
        System.out.println("\nAvailable Balance :" + a1.getBalance() + "\n");

        Type_2 a2 = new Type_2(2001007, "Pranav", 45000);
        System.out.println(a2.getAccHolder() + "'s transactions");
        a2.deposit(500);
        a2.withdraw(30000);
        a2.withdraw(15000);
        System.out.println("\nAvailable Balance :" + a2.getBalance() + "\n");
    }
}