// Write a program that, given two integers, two doubles as x and y coordinates of two points p1(x1,y1) and p2(x2,y2) on a two-dimensional plane as input, finds the midpoint p3(x3,y3) of the line segment formed by p1 and p2 using the formula:
// x3 = (x1 + x2)/2 and y3 = (y1 + y2)/2
// Generic class Point has the following members.
//  • Instance variables x and y
//  • A constructor to initialize x and y
//  • A method mid(Point p) to return the mid-point of the line segment joining the current point to p  
//  • A method that overrides the method toString() in the Object class to format the output
// Class p46MidPoint has the main method.
//  • The main method accepts the two input points. The first line of input will be two integers of point p1. The second line of input will be two doubles of point p2. It then invokes the method mid of one of the objects.

import java.util.Scanner;

class Point <T extends Number>
{
  T x,y;
  public Point(T x,T y)
  {
    this.x = x;
    this.y = y;
  }

  public Point<Double> mid(Point <?> obj)
  {
    double x3 = (this.x.doubleValue() + obj.x.doubleValue())/2;
    double y3 = (this.y.doubleValue() + obj.y.doubleValue())/2;
    return new Point<>(x3,y3); 
  }

  @Override
  public String toString()
  {
    return "(" +this.x+","+this.y+")";
  }
}

public class p46MidPoint
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    Point<Integer> p1 = new Point<>(input.nextInt(),input.nextInt());
    Point<Double> p2 = new Point<>(input.nextDouble(),input.nextDouble());
    Point<Double> p3 = p1.mid(p2);
    System.out.println(p3);
  }
}