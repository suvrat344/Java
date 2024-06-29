// Define a base class Vehicle with a method service() and a subclass Car that overrides service(). In Car's service(),provide a specific implementation that calls super.service() as well, to show how overriding works.

class Vehicle
{
  public void service()
  {
    System.out.println("Vehicle servicing...");
  }
}

class Car extends Vehicle
{
  @Override
  public void service()
  {
    super.service();
    System.out.println("Car servicing...");
  }
}


public class p14Vehicle
{
  public static void main(String[] args)
  {
    Vehicle v = new Vehicle();
    Car c = new Car();

    v.service();
    c.service();
  }
}
