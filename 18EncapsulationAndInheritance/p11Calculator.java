// Create a simple application with at least two packages: com.example.geometry and com.example.utils. In the geometry package, define classes like Circle and Rectangle. In the utils package, create a Calculator class that can compute areas of these shapes.

class Circle
{
  public double radius;

  public Circle(double radius)
  {
    this.radius = radius;
  }
}

class Rectangle
{
  public int length;
  public int width;

  public Rectangle(int length,int  width)
  {
    this.length = length;
    this.width = width;
  }
}

public class p11Calculator
{
  public static void main(String[] args) 
  {
    Circle c1 = new Circle(5.5);
    Rectangle r1 = new Rectangle(10,5);

    double cirArea = Math.PI * Math.pow(c1.radius,2);
    int rectArea = r1.length * r1.width;

    System.out.printf("Area of the circle is %.2f,Area of the rectangle is %d",cirArea,rectArea);
  }
}


