// Enhance the Day enum by adding an attribute that indicates whether it is a weekday or weekend. Add a method in the enum that returns whether it's a weekday or weekend, and write a program to print out each day along with its type.

enum Day
{
  SUNDAY("WeekEnd"),MONDAY("WeekDay"),TUESDAY("WeekDay"),WEDNESDAY("WeekDay"),THURSDAY("WeekDay"),FRIDAY("WeekDay"),SATURDAY("WeekEnd");

  private final String type;

  private Day(String type)   // Only Private Constructor
  {
    this.type = type;
  } 

  public String getType()
  {
    return type;
  }
}

public class p19EnumDayWithAttrribute
{
  public static void main(String[] args) 
  {
    Day[] days = Day.values();
    for(Day d : days)
    {
      System.out.println(d + " : " + d.getType());
    }
  }
}
