// Employee e1 does a set of projects.Employee e2 also does all the projects did by e1 except the first project, in place of which e2 does another project. Write a program that define two classes Employee and p42Employee. Define copy constructor to create e2 from e1 in such a way that changing the values of instance variables of either e2 or e1 should not affect the other one.The code takes name of e2 and new project done by e2 as input.Complete the program as specified below.
// Class Employee that has the following members.
//  1. Private instance variables String name and String[] projects to store name and projects respectively.
//  2. Define required constructor(s)
//  3. Accessor methods getName() and getProject() to get the name of employee and project at specific index.
//  4. Mutator method setName() and setProject() to set name of employee and project at specific index.
// Class p42Employee that has the method main which does the following.
//  1. Two objects of Employee e1 and e2 are created. e2 is created using e1.
//  2. name of e2 and second item bought by e2 are updated by taking input.
//  3. name of e1,e2 and first project done by e1 and e2 are printed.


import java.util.Scanner;

class Employee
{
    String name;
    String[] projects;

    public Employee(String name,String[] projects)
    {
        this.name = name;
        this.projects = projects;

    }

    public Employee(Employee obj)
    {
        this.name = obj.name;
        this.projects = new String[obj.projects.length];

        for(int i = 0;i < obj.projects.length;i++)
        {
            this.projects[i] = obj.projects[i];
        }
    }

    public void setName(String n) 
    {
        this.name = n;
    }
    public void setProject(int index, String proj) 
    {
        this.projects[index] = proj;
    }
    public String getName() 
    {
        return this.name;
    }
    public String getProject(int indx) 
    {
        return this.projects[indx];
    }
}


public class p42Employee 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String[] proj =  {"PJ1", "PJ2", "PJ3"};
        Employee e1 = new Employee("Surya", proj);
        Employee e2 = new Employee(e1);
        System.out.println("Enter name");
        e2.setName(input.next());
        System.out.println("Enter project");
        e2.setProject(0, input.next());
        System.out.println(e1.getName() + ": " + e1.getProject(0));
        System.out.println(e2.getName() + ": " + e2.getProject(0));
    }
}
