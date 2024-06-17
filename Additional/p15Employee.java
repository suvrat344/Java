// Create a class employee with constructor taking three arguments employee id,employee name,employee projects and another constructor which copies and employee

import java.util.Scanner;

class Employee
{
    String eid;
    String ename;
    String eprojects[];

    
    Employee(Employee emp) 
    {
        this.eid = emp.eid;
        this.ename = emp.ename;
        this.eprojects = new String[emp.eprojects.length];

        for(int i = 0; i < emp.eprojects.length;i++) 
        {
        	this.eprojects[i] = emp.eprojects[i];
        }
    }
    
    Employee(String id,String name,String[] project)
    {
        this.eid = id;
        this.ename = name;
        this.eprojects = project;
    }

    public void display()
    {
        System.out.println("id:" + this.eid);
        System.out.println("name:" + this.ename);
        System.out.println("projects:");
        for (String project : this.eprojects)
        {
            System.out.print(project+":");
        }
    }

    public void mutator()
    {
        this.ename = "Mr "+ this.ename;
        this.eprojects[0] = null;
    }
    
}


public class p15Employee
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
    	String project[] = {"P001","P002","P003"};


        System.out.print("Enter id of the employee : ");
        String id = input.nextLine();

        System.out.print("Enter name of the employee : ");
        String name = input.nextLine();
        
        Employee e1 = new Employee(id,name,project);
        Employee e2 = new Employee(e1); 
       
        e1.mutator();
        
        e2.display();
    }
}