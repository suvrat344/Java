// Create a class Point which takes x and y and make two object of point class and override equals and toString method.

import java.util.Scanner;

class Point
{
    private int x;
    private int y;

    public Point(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public boolean equals(Object obj) 
    {
        if(obj instanceof Point) 
        {
            Point p = (Point) obj;
            return this.x == p.x && this.y == p.y;
        }
        return false;
    }

    @Override
    public String toString() 
    {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public int hashCode()
    {
        return 31 * x + y;
    }
}


public class p17Point
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x-coordinate of first point : ");
        int x1 = input.nextInt();
        System.out.print("Enter y-coordinate of first point : ");
        int y1 = input.nextInt();

        System.out.print("Enter x-coordinate of second point : ");
        int x2 = input.nextInt();
        System.out.print("Enter y-coordinate of second point : ");
        int y2 = input.nextInt();
	    
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
		
        if(p1.equals(p2))
            System.out.println(p1 + " == " + p2);
        else
            System.out.println(p1 + " != " + p2);
    }
}
