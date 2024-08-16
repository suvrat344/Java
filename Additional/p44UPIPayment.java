// Write a Java program as instructed.
// • Abstract class UPIPayment has two abstract methods: abstract void payment() and abstract void rewards()
// • Class PhonePay extends class UPIPayment and has the following members.
//    – private int amount as private instance variable
//    – Constructor to initialize the instance variable
//    – You should override method public void payment() such that the overridden method displays the message "Phone pay:Payment success:" and invokes method rewards().
//    – You should override method public void rewards() as follows.
//      ∗ If amount < 500, then display the message "Sorry no rewards".
//      ∗ Else, if amount >= 500, then display the message "10 off on next mobile rc".
// • Class Paytm extends class UPIPayment and has the following members.
//    – private int amount as private instance variable
//    – Constructor to initialize the instance variable
//    – You should override method public void payment() such that the overridden method displays the message "Paytm:Payment success:" and invokes method rewards().
//    – You should override method public void rewards() as follows.
//      ∗ If amount < 500, then display the message "Sorry no rewards".
//      ∗ Else, if amount >= 500, then display message "10 off on next DTH rc".
// • Class UPIUser has the following method.
//    – Method public void transferAndGetRewards(UPIPayment obj) that invokes method payment() using obj.
// • Class p43UPIPayment has the main method, and has the following functionality.
//    – Creates an object of UPIUser
//    – Takes two amounts a1 for PhonePay and a2 for Paytm
//    – Invokes method transferAndGetRewards() first by passing an object of PhonePay with amount a1 as parameter, and then by passing an object of Paytm with amount a2 as parameter


import java.util.Scanner;

abstract class UPIPayment
{
    abstract void payment();
    abstract void rewards();
}


class PhonePay extends UPIPayment
{
    private int amount;

    public PhonePay(int amount) 
    {
        this.amount = amount;
    } 
    
    @Override
    public void payment()
    {
        System.out.println("Phone pay:Payment success:");
        rewards();
    }
    
    @Override
    public void rewards()
    {
        if(this.amount < 500)
        {
            System.out.println("Sorry no rewards");
        }
        else
        {
            System.out.println("10 off on next mobile rc");
        }
    }
}


class Paytm extends UPIPayment
{
    private int amount;

    public Paytm(int amount) 
    {
        this.amount = amount;
    }

    @Override
    public void payment()
    {
        System.out.println("Paytm:Payment success:");
        rewards();
    }
    
    @Override
    public void rewards()
    {
        if(this.amount < 500)
        {
            System.out.println("Sorry no rewards");
        }
        else
        {
            System.out.println("10 off on next DTH rc");
        }
    }
}


class UPIUser
{
    public void transferAndGetRewards(UPIPayment obj) 
    {
        obj.payment();
    }
}


public class p44UPIPayment
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount for PhonePe : ");
        int a1 = input.nextInt();

        System.out.print("Enter amount for Paytm : ");
        int a2 = input.nextInt();

        UPIUser u = new UPIUser(); 
        u.transferAndGetRewards(new PhonePay(a1));
        u.transferAndGetRewards(new Paytm(a2));
    }
}
