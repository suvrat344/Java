// Create an enum called Day that represents the days of the week. Write a program that prints out all the days of the week from this enum.

enum Day
{
  SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class p18EnumDay
{
  public static void main(String[] args) 
  {
    // Get specific enum
    Day day = Day.valueOf("SUNDAY");
    System.out.println(day);

    // Get all enum
    Day[] days = Day.values();
    for(Day d : days)
    {
      System.out.println(d);
    }
  }
}


// enum TrafficLight {
//   RED("Stop"), 
//   GREEN("Go"), 
//   YELLOW("Caution");

//   private final String action;

//   TrafficLight(String action) {
//       this.action = action;
//   }

//   public String getAction() {
//       return action;
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//       for (TrafficLight light : TrafficLight.values()) {
//           System.out.println(light + ": " + light.getAction());
//       }
//   }
// }
