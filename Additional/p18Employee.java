// Create a class person which take name and aadhar name and class employee which inherit class person takes argument salary and class contact employee which inherit employee class takes argument contact hour.

import java.util.Scanner;

class Person{
    private String name;
    private long aadharno;

    public Person(String name, long aadharno)
    {
        this.name = name;
        this.aadharno = aadharno;
    }
    public void print() 
    {
        System.out.println("name : " + name);
        System.out.println("aadharno : " + aadharno);
    }
}

class Employee extends Person
{
    private double salary;

    public Employee(String name,long aadhar,double salary)
    {
        super(name,aadhar);
        this.salary = salary;
    }
    
    @Override
    public void print()
    {
        super.print();
        System.out.println("salary : " + this.salary);
    }
}

class ContactEmployee extends Employee
{
    final private static double hourlyPay = 100.00;
    private int contactHour;
	
    public ContactEmployee(String name,long aadhar,int contactHour)
    {
        super(name,aadhar,hourlyPay * contactHour);
        this.contactHour = contactHour;
    }
    //salary is computed as contactHour * hourlyPay  
}

public class p18Employee
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name of the first employee : ");
        String nm1 = input.nextLine();

        System.out.print("Enter name of the second employee : ");
        String nm2 = input.nextLine();

        System.out.print("Enter aadhar of the first employee : ");
        long adh1 = input.nextLong();

        System.out.print("Enter aadhar of the second employee : ");
        long adh2 = input.nextLong();

        System.out.print("Enter salary of the first employee : ");
        double sal = input.nextDouble();

        System.out.print("Enter contact hour of the second employee : ");
        int cont = input.nextInt();
        
        Employee[] eArr = new Employee[2];
        eArr[0] = new Employee(nm1, adh1, sal);
        eArr[1] = new ContactEmployee(nm2, adh2, cont);
        for(Employee e : eArr)
            e.print();
    }
}
