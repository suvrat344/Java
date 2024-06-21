// Calculate the area and circumference of a circle for a given radius 

import java.util.Scanner;

class Circle
{
  private final double PI = Math.PI;
  private float radius;

  public Circle(float radius)
  {
    this.radius = radius;
  }

  public void circumference()
  {
    System.out.printf("Circumference of Circle : %.2f\n",2 * PI * this.radius);
  }

  public void area()
  {
    System.out.printf("Circumference of Circle : %.2f\n",PI * this.radius * this.radius);
  }
}


public class p30AreaAndCircumferenceOfCircle
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter radius : ");
      float radius = input.nextFloat();

      Circle c1 = new Circle(radius);
      c1.circumference();
      c1.area();
  }
}
