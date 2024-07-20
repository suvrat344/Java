// Write a java program that creates 3 objects of students and prints the name of student with highest total.Implement the code as follows:
// Define class Student with following members:
//  1. String name, double[] marks (array length is 3) as instance variables which represents the name and marks of students.
//  2. Constructor to initialize instance variables.
//  3. Accessor method getName() that returns the name of student.
//  4. Method findTotal() that returns the total marks of the student.
// Define class p41Student that has the following members:
//  1. Method getMax() which takes Student() as parameter and returns the name of the student with highest total.
//  2. main() method, that creates 3 instances of Students, store them in an array and invokes the method getMax() by passing that Student[].

import java.util.Scanner;

class Student
{
    String name;
    double[] marks;

    public Student(String name,double[] marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public String getName()
    {
        return this.name;
    }

    public double findTotal()
    {
        double total = 0;
        for (double element : this.marks) 
        {
            total = total + element;
        }
        return total;
    } 
}


public class p41Student
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Student[] arr = new Student[3];   

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter name");
            String name = input.next();
            System.out.println("Enter marks of 3 subjects");
            double[] m = {input.nextDouble(), input.nextDouble(), input.nextDouble()};
            arr[i] = new Student(name, m);
        }
        System.out.println(getMax(arr));  
    }


    static String getMax(Student[] arr)
    {
        double max = 0,total;
        String name="";

        for (int i = 0; i < 3; i++) 
        {
            total = arr[i].findTotal();
            if(total > max)
            {
                max = total;
                name = arr[i].getName();
            }
        }
        return name;
    }
}
