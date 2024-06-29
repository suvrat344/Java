// Create an interface Flyable with an abstract method fly().Create an abstract class Bird that implements Flyable.Implement a subclass Eagle that extends Bird. Provide an implementation for the fly() method

interface Flyable
{
  void fly();   // public and abstract by default
}

abstract class Bird implements Flyable{};


class Eagle extends Bird
{
  public void fly()
  {
    System.out.println("Eagle can fly.");
  }
}

public class p12Bird 
{
  public static void main(String[] args)
  {
    Eagle e = new Eagle();
    e.fly();
  }
}
