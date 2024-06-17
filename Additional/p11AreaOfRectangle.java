// Create a class rectangle that initialize length and breadth of rectangle and calculate area of rectangle.

import java.util.Scanner;

class Rectangle
{
    int w;    
    int h;    

	void setw(int a)
    {
	    w = a;
	}

	void seth(int b)
    {
	   h = b;
	}

    int area()
    {
        return w * h;
    }
}



public class p11AreaOfRectangle
{
	public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height of a rectangle : ");
        int h = Integer.parseInt(input.nextLine());

        System.out.print("Enter width of a rectangle : ");
        int w = Integer.parseInt(input.nextLine());

        Rectangle r = new Rectangle();
        r.setw(w);
        r.seth(h);
        int area = r.area();
        System.out.print("Area of a rectangle is " + area);
    }
}
