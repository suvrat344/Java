// A school is planning for a second Covid-19 vaccination drive on 30/03/2022, for students who have already taken the first dose. A student is eligible for the second dose if 28 days have passed since the first dose. Write a Java program to find the list of students who are eligible for the second dose of vaccination, based on the date of their first dose. Note that you must use the Stream class.
// Your program takes as input a positive integer, which is the total number of students, followed by the roll number and the date of first dose of vaccination in "dd/MM/yyyy" format for each student.
// Your program should print the roll numbers of all students who are eligible for the second dose on 30/03/2022
// The roll number, the date of first dose of vaccination and the planned date of second dose are available as instance variables in class Student.
// Things to be done:
// Define method isEligible() inside class Student that returns true if the student is eligible for the second dose.
// Define class StudentList inside which you have to define two methods - getEligibleList(List<Student>) and isEmpty(Stream<Student>).
// The method getEligibleList(List<Student>) returns a stream of eligible students using method isEligible() inside class Student
// The method isEmpty(Stream<Student>) checks if the stream is empty, in order to customize the output message. If the stream is empty, it should print the message: There are no eligible students. If the stream is not empty, then it prints the message: The list of eligible students are: followed by the roll numbers of eligible students.

import java.util.stream.Stream;
import java.util.*;
import java.text.*;

class Student
{
    private int roll_num;
    private Date dose_one = new Date(); 
    private Date dose_two = new Date();	
    	

    public Student(int roll_num, String dd_str) 
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.roll_num = roll_num;
        try 
        {			
            dose_one = sdf.parse(dd_str);		
            dose_two = sdf.parse("30/03/2022");
        }
        catch(ParseException e)
        {
            System.out.println("Incorrect Date Format");
        }
    }	

    public int getRollNo() 
    {
        return this.roll_num;
    }

    public boolean isEligible() 
    {
        if((dose_two.getTime() - dose_one.getTime())/(1000l * 60 * 60 * 24) > 28)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}


class StudentList
{
    public Stream<Student> getEligibleList(List<Student> stu)
    {
        Stream<Student> eligible_student = stu.stream().filter(s -> s.isEligible());
        return eligible_student;
    }

    public boolean isEmpty(Stream<Student> stu)
    {
        if(stu.count() == 0)
        {
            return true;
        }
        else
        {
            return false;
        } 
    }
}


public class p38SecondDose
{
    public static void main(String[] args) 
    {		
        Scanner input = new Scanner(System.in);
        int roll_num;		
        String dose_one_str;
        List<Student> full_list = new ArrayList<>();
        
        System.out.print("Enter number of students : ");
        int num = input.nextInt();

        for (int i=0; i<num; i++) 
        {
            System.out.print("Enter roll number : ");
            roll_num = input.nextInt();

            System.out.print("Enter date of dose1 : ");
            dose_one_str = input.next();
            
            Student st = new Student(roll_num, dose_one_str);
            full_list.add(st);
        }
        
        StudentList list = new StudentList();	

        Stream<Student> eligible_list = list.getEligibleList(full_list);
        if (!list.isEmpty(eligible_list)) 
        {
            System.out.println("The list of eligible students are: ");
            eligible_list = list.getEligibleList(full_list);
            eligible_list.forEach(s -> System.out.println(s.getRollNo()));
        }
        else 
        {
            System.out.println("There are no eligible students.");
        }
    }
}