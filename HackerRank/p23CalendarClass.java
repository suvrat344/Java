// You are given a date. You just need to write the method, getDay, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
// Example
// month = 8
// day = 14
// year = 2017
// The method should return MONDAY as the day on that date.
// Function Description
// Complete the findDay function.
// findDay has the following parameters:
// int: month
// int: day
// int: year
// Returns
// string: the day of the week in capital letters
// Input Format
// A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY   format.
// Sample Input
// 08 05 2015
// Sample Output
// WEDNESDAY
// Explanation
// The day on August th  was WEDNESDAY.


import java.util.*;

class Result 
{
    public static String findDay(int month, int day, int year) 
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,day);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String dayName = "";
        switch(dayOfWeek)
        {
            case Calendar.SUNDAY : dayName =  "SUNDAY";break;
            case Calendar.MONDAY : dayName = "MONDAY";break;
            case Calendar.TUESDAY : dayName = "TUESDAY";break;
            case Calendar.WEDNESDAY : dayName = "WEDNESDAY";break;
            case Calendar.THURSDAY : dayName = "THURSDAY";break;
            case Calendar.FRIDAY : dayName = "FRIDAY";break;
            case Calendar.SATURDAY : dayName =  "SATURDAY";break;
        }
        return dayName;
    }
}

public class p23CalendarClass
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day month year separtaed by space : ");
        String[] date = input.nextLine().split(" ");

        int month = Integer.parseInt(date[0]);
        int day = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);

        String res = Result.findDay(month, day, year);
        System.out.println("Day of the week : " + res);
    }
}