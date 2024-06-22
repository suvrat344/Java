// Create a class shape which have two methods area and volume which return 0 and class rectangle,cube inherit from class shape. Class recangle takes two argument width, height and method area which calculate area of rectangle.Class cube  which take edge as argument and calculate volume of cube.
// Method caller takes class as argument and check instance of rectangle and cube and call method area,volume respectively.

import java.util.Scanner;

class Shape{
    public int area() {
        return 0;
    }
    public int volume() {
        return 0;
    }
}

class Rectangle extends Shape
{
    private int w, h;

    public Rectangle(int w,int h)
    {
        this.w = w;
        this.h = h;
    }
    
    @Override
    public int area()
    {
        return w * h;
    }
}

class Cube extends Shape
{
    private int a;
    
    public Cube(int a)
    {
        this.a = a;
    }
    
    @Override
    public int volume()
    {
        return (int) Math.pow(a,3);
    }
}

public class p19Shape{
    private static void caller(Shape s) {
        //check if s is of type Rectangle
        if(s instanceof Rectangle)
        {
            System.out.println(s.area());
        }
        //check if s is of type Cube
        if(s instanceof Cube)
        {
            System.out.println(s.volume());
        }
    }
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width of rectangle : ");
        int w = sc.nextInt();

        System.out.print("Enter height of rectangle : ");
        int h = sc.nextInt();

        System.out.print("Enter edge of the cube : ");
        int a = sc.nextInt();

        caller(new Rectangle(w, h));
        caller(new Cube(a));
    }
}
