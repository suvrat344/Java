// Complete the Java program to create two objects a1 and a2 of type Airplane. a2 should be created from a1 using cloning such that any later changes to a2 do not affect a1.
// • Class Airplane implements Cloneable interface and has/should have the following members:
//    – Instance variables String company, eng of type Engine, and String model
//    – Constructor to initialize the instance variables
//    – Mutator methods as needed
//    – Overridden method toString()
//    – Implement method clone() that achieves deep copy using cloning
// • Class Engine implements Cloneable interface and has/should have the following members:
//    – Instance variables String name and int numEngines
//    – Constructor to initialize the instance variables
//    – Mutator methods as needed
//    – Overridden method toString()
//    – Implement method clone()
// • Class AirplaneCloneTest contains the main method that takes the inputs and invokes appropriate methods to achieve the functionality.
// What you have to do
// • Implement method clone() in class Airplane
// • Implement method clone() in class Engine


class Airplane implements Cloneable
{
  private String company;
  private String model;
  private Engine engine;
  public Airplane(String company, String model, Engine engine) 
  {
    this.company = company;
    this.model = model;
    this.engine = engine;
  }

  @Override
  public String toString() 
  {
    return this.company+": " + this.model + this.engine;
  }
  public void setEngine(String name, int num) 
  {
    engine.setName(name);
    engine.setNumEngines(num);
  }

  public void setModel(String model) 
  {
    this.model = model;
  }
  
  public Airplane clone() throws CloneNotSupportedException
  {
    Airplane newPlane = (Airplane)super.clone();
    newPlane.engine = this.engine.clone();
    return newPlane;
  }
}


class Engine implements Cloneable
{
  private String name;
  private int numEngines;
  
  public Engine clone() throws CloneNotSupportedException
  {
    return (Engine)super.clone();
  }

  public Engine(String name,int num)
  {
    this.name = name; 
    this.numEngines = num;
  }

  public void setName(String name) 
  {
    this.name = name;
  }

  public void setNumEngines(int n) 
  {
    this.numEngines = n;
  }

  @Override
  public String toString() 
  {
    return "[" + this.name +", " + this.numEngines+"]";
  }
}


public class p58AirplaneCloneTest
{
  public static void main(String[] args) throws CloneNotSupportedException 
  {
    Airplane a1 = new Airplane("Boeing","747",new Engine("GE",4));
    Airplane a2 = a1.clone();

    a2.setModel("737");
    a2.setEngine("RR",3);
    System.out.println(a1);
    System.out.println(a2);
  }
}