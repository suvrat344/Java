// Complete the following program which models a car rental kiosk, and handles user requests as detailed below.
// The program should first accept the number of car rental requests, and then accept details of each request in the following format.
// Total number of passengers in the group for the rental request.
// Destination of the visit.	
// These values are used for initialization of fields inside the constructor of CarRental class.
// There is a HashMap called available_destinations which contains a set of preassigned destinations and the fare  for dropping at that destination. This map is also initialized in the constructor of CarRental class.
// The carBooker() method processes the booking requests, and should have the following functionalities:
// It should retrieve the fare for the chosen destination from the available_destinations map and calculate the fare per head by dividing the fare for the destination by passenger_count. Then, it should print the destination and the fare per head, in the format shown in the public test cases. 
// The method should generate/handle the following exceptions.	
// ImproperHeadCountException should be thrown when passenger_count is zero or negative. The catch block handling this exception should print the exception type along with the message: "Head count should be positive non-zero value".	
// If the chosen_destination is not found in available_destinations, a NullPointerException is thrown. The catch block handling this should create a new exception called WrongDestinationException, set the new exception as the cause of the NullPointerException, and then re-throw it.WrongDestinationException object should be created such that when getCause() is called, it prints the message as shown in the public test cases. 

import java.util.*;

class WrongDestinationException extends Exception
{
    public WrongDestinationException(String s)
    {
        super(s);
    }
}

class ImproperHeadCountException extends Exception
{
    public ImproperHeadCountException(String s)
    {
        super(s);
    }
}


class CarRental
{
    int passenger_count;
    String chosen_destination;
    HashMap<String,Double> available_destinations;  
	
    public CarRental(int pc, String dest) 
    {
        this.passenger_count = pc;
        this.chosen_destination = dest;
        available_destinations = new HashMap<>();
        available_destinations.put("Marina Beach", 2000.0);
        available_destinations.put("Elliot's Beach", 5000.0);
        available_destinations.put("Film City", 8000.0);
    }
    public void carBooker()
    {
        Double total_rent = available_destinations.get(chosen_destination);
        try
        {
            if(passenger_count < 1)
            {
                throw new ImproperHeadCountException("Head count should be positive non-zero value");
            } 
            double per_head_rent = total_rent / passenger_count;
            System.out.println("Destination: " + chosen_destination + ", Head cost: " + per_head_rent);
        }
        catch(ImproperHeadCountException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException n)
        {
            n.initCause(new WrongDestinationException("Invalid destination"));
            throw n;
        }
    }
}


public class p33CarRental
{
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of car rental request : ");
        int num = input.nextInt();

        try 
        {
            for(int i = 1;i <= num;i++) 
            {
                System.out.print("Enter headcount : ");
                int heads = input.nextInt();
                input.nextLine();

                System.out.print("Enter destination : ");
                String dest = input.nextLine();   

                CarRental obj = new CarRental(heads,dest);
                obj.carBooker();
            }
        }
        catch(Exception e) 
        {
            System.out.println(e.getCause());
        }
    }
}
