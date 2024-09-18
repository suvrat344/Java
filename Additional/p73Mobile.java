// A smartphone is both a mobile device and a camera. Complete the Java program below in order to print customized messages based on which among the two roles- mobile device or camera- of a smartphone is being given as input.
//  • Interface MobileDevice has the abstract method makeCall()
//  • Interface Camera has the abstract method takePicture()
//  • Class Smartphone has properties of both a MobileDevice and a Camera, and has the following members
//      - method makeCall() that returns the string: <Name of the device> makes a call 
//      – method takePicture() that returns the string: <Name of the device> takes a picture
//  • Class p73Mobile has the main method that does the following:
//      – Accepts as input the types and names of 3 devices
//      – If the type is M, then invoke method makeCall(), else invoke method takePicture()
//      – Print the messages
//  What you have to do
//  • Define interface MobileDevice
//  • Define interface Camera
//  • Define class Smartphone
//  Test Case1:
//  M Samsung
//  C Canon
//  M iPhone
//  Output:
//  Samsung makes a call
//  Canon takes a picture
//  iPhone makes a call

import java.util.*;
 
abstract interface MobileDevice
{
  abstract String makeCall();
}


abstract interface Camera
{
  abstract String takePicture();
}


class Smartphone implements MobileDevice,Camera
{
  private String name;
  public Smartphone(String name)
  {
    this.name = name;
  }

  @Override
  public String makeCall()
  {
    return this.name + " makes a call"; 
  }

  @Override
  public String takePicture()
  {
    return this.name + " takes a picture";
  }
}

public class p73Mobile
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    ArrayList<String> messagesList = new ArrayList<>();
    for(int i=0;i<3;i++)
    {
      String type = input.next();
      if (type.equals("M"))
      {
        MobileDevice m = new Smartphone(input.next());
        messagesList.add(m.makeCall());
      }
      else if (type.equals("C"))
      {
        Camera c = new Smartphone(input.next());
        messagesList.add(c.takePicture());
      }
    }
    for (String s:messagesList)
    {
      System.out.println(s);
    }
    input.close();
  }
}
