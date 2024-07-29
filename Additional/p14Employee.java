// Create a class Employee with constructor with no parameter and other with parameter employee name,id,department if object of Employee class with no argument then give employee name as guest and copy department of employee having three arguments into employee having no arguments.Display employee details.


import java.util.Scanner;

class Employee
{
	String ename;
	String eid;
	String edept;
	
	public Employee()
	{
				ename = "guest";
	}

	public Employee(String name,String id,String dept)
	{
			ename = name;
			eid = id;
			edept = dept;
	}
		
	public void copyDept(Employee other)
	{
			this.edept = other.edept;
	}
		
	public void displayDetails()
	{
			System.out.println("ename : " + this.ename);
			System.out.println("eid : " + this.eid);
			System.out.println("edept : " + this.edept);
	} 
}


public class p14Employee
{
	public static void main(String args[]) 
	{
				Scanner input = new Scanner(System.in);
				Employee e1 = new Employee();

				System.out.print("Enter name of the employee : ");
				String name = input.nextLine();

				System.out.print("Enter id of the employee : ");
				String id = input.nextLine();

				System.out.print("Enter department of the employee : ");
				String dept = input.nextLine();

				Employee e2 = new Employee(name,id,dept);

				e1.copyDept(e2); 

				e1.displayDetails();
				e2.displayDetails();
	}
}
