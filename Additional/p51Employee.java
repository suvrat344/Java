// Employee e1 does a set of projects. Employee e2 also does all the projects did by e1 except the first project, in place of which e2 does another project. Write a program that defines two classes Employee and p51Employee. Create copy of e1, say it as e2 in such a way that changing the values of instance variables of either e2 or e1 should not affect the other one. The code takes name of e2 and new project done by e2 as input. Complete the program as specified below.
// • Class Employee that implements Cloneable interface and has the following members:
//    – Private instance variables String name and String[] projects to store name and projects respectively
//    – Define required constructor
//    – Define accessor methods getName() and getProject() to get name of employee and project at specific index.
//    – Define mutator methods setName() and setProject() to set name of employee and project at specific index.
//    – Override the method clone()
// • Class p51Employee that has the method main which does the following:
//    – Two objects of Employee e1 and e2 are created. e2 is created using e1.clone()
//    – Input to update name of e2 and second item bought by e2 are taken Names of e1, e2 and first project done by e1 and e2 are printed.


import java.util.*;

class Employee implements Cloneable
{
    private String name;
    private String[] projects;

    public Employee(String name,String[] projects)
    {
        this.name = name;
        this.projects = projects;
    }

    public Employee clone() throws CloneNotSupportedException
    {
        Employee e = (Employee)super.clone();
        e.projects = e.projects.clone();
        return e;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getProject(int index)
    {
        return this.projects[index];
    }

    public void setProject(int index,String proj)
    {
        this.projects[index] = proj;
    }
}


public class p51Employee 
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        String[] proj =  {"PJ1", "PJ2", "PJ3"};
        Employee e1 = new Employee("Surya", proj);
        Employee e2 = e1.clone();
        e2.setName("Sneha");
        e2.setProject(0,"PJ5");
        System.out.println(e1.getName() + ": " + e1.getProject(0));
        System.out.println(e2.getName() + ": " + e2.getProject(0));
    }
}