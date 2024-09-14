// Complete the Java program to demonstrate the use of abstract classes and interfaces. You have to complete the definition of classes JuniorRS and SeniorRS to obtain the output as given in the public test cases.
// • Interface IResearchScholar has two methods: public void teaches(String str) and public void studies(String str).
// • Defineclasses JuniorRS and SeniorRS such that JuniorRS implements IResearchScholar and SeniorRS extends JuniorRS.
// • Class p69Scholar extends SeniorRS, and has the main method. An object of JuniorRS invokes the method studies, and an object of SeniorRS invokes methods studies and teaches.
// Input:
// Python
// Java
// Output:
// TA studies Python
// TA studies Java
// TA teaches Java

interface IResearchScholar
{
  public void teaches(String str);
  public void studies(String str);
}


abstract class JuniorRS implements IResearchScholar
{
  public void studies(String str)
  {
    System.out.println("TA studies " + str);
  }
}


class SeniorRS extends JuniorRS
{
  public void teaches(String str)
  {
    System.out.println("TA teaches " + str);
  }
}

public class p69Scholar extends SeniorRS
{
  public static void main(String[] args) 
  {
    JuniorRS jrs = new p69Scholar();
    SeniorRS srs = new p69Scholar();
    jrs.studies("Python");
    srs.studies("Java");
    srs.teaches("Java");
  }
}
