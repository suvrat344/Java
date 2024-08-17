// Write a program to clone an object e1 of class Employee by implementing the interface Cloneable. After cloning, update the department and the address of  e1. Complete the program as detailed below to achieve this functionality.   
// Define classes Address and Department that implement the interface Cloneable, and have the following members: 
// In both classes, add an instance variable of String type (to store the address and the department respectively) 
// Implement the required constructor(s) and accessors. 
// Override the method clone.
// Define a class Person that implements the interface Cloneable, and has the following members:
// Instance variables name of type String and addr of type Address	
// Implement the required constructor(s) and accessors
// Override the method clone
// Define a class Employee that implements the interface Cloneable, extends the class Person, and has the following members:
// Instance variable dept of type Department	
// Implement the required constructor(s) and accessors.
// Override the method clone.
// Define a method updateEmp to update the dept and addr of an Employee object



import java.util.*;

class Address implements Cloneable
{
    private String add;

    public Address(String add)
    {
        this.add = add;
    }

    public String getAddress()
    {
        return this.add;
    }

    public void setAddress(String add)
    {
        this.add = add; 
    }

    public Address clone() throws CloneNotSupportedException
    {
        return (Address) super.clone();
    }
}


class Department implements Cloneable
{
    private String dept;

    public Department(String dept)
    {
        this.dept = dept;
    }

    public String getDepartment()
    {
        return this.dept;
    }

    public void setDepartment(String dept)
    {
        this.dept = dept;
    }

    public Department clone() throws CloneNotSupportedException
    {
        return (Department) super.clone();
    }
}


class Person implements Cloneable
{
    private String name;
    Address add;

    public Person(String name,Address add)
    {
        this.name = name;
        this.add = add;
    }

    public Person clone() throws CloneNotSupportedException
    {
        Person p = (Employee) super.clone();
        p.add = add.clone();
        return p;
    }

    @Override 
    public String toString()
    {
        return this.name + " : " + add.getAddress();
    }

    public void updatePerson(String address)
    {
        add.setAddress(address);
    }
}


class Employee extends Person implements Cloneable
{
    Department dept;

    public Employee(String name,Address add,Department dept)
    {
        super(name,add);
        this.dept = dept;
    }

    public Employee clone() throws CloneNotSupportedException
    {
        Employee e = (Employee) super.clone();
        e.dept = dept.clone();
        return e;
    }

    @Override 
    public String toString()
    {
        return super.toString() + " : " +  dept.getDepartment();
    }

    public void updateEmp(String add,String department)
    {
        super.updatePerson(add);
        dept.setDepartment(department);
    }
}


public class p37CloneEmployee
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = sc.next();

        System.out.print("Enter address : ");
        String address1 = sc.next();

        System.out.print("Enter department : ");
        String department1 = sc.next();

        System.out.print("Enter address : ");
        String address2 = sc.next();

        System.out.print("Enter department : ");
        String department2 = sc.next();

        try 
        {
            Employee e1 = new Employee(name, new Address(address1), new Department(department1));
            Employee e2 = e1.clone(); 
            e1.updateEmp(address2, department2);
            System.out.println(e1 + ", " + e2);
        }
        catch(CloneNotSupportedException e) 
        {
            System.out.println("clone() not supported");
        }
    }
}