// Create an abstract class Shape with an abstract method calculateArea(). Implement two subclasses: Circle and Square. Each subclass should have relevant attributes (like radius for Circle, side for Square) and their own implementation of the calculateArea() method

abstract class Shape
{
  public abstract void calculateArea();
}

class Circle extends Shape
{
  private float radius;
  public Circle(float radius)
  {
    this.radius = radius;
  }

  public void calculateArea()
  {
    System.out.println("Area of Circle : " + (Math.PI * Math.pow(radius,2)));
  }
}


class Square extends Shape
{
  private float side;

  public Square(float side)
  {
    this.side = side;
  }

  public void calculateArea()
  {
    System.out.println("Area of Square : " + (Math.pow(side,2)));
  }
}


public class p11Shape
{
  public static void main(String[] args)
  {
    Circle c = new Circle(5);
    c.calculateArea();

    Square s = new Square(4);
    s.calculateArea();
  }
}