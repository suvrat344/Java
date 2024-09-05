// Class Voter
//  - has instance variables age, isCitizen, isRegistered, firstTimeVoter.
//  - has a constructor to initialise the instance variables.
//  - has a method validate Voter that checks for certain criteria to declare the voter as eligible:
//     > inside the try block, check and throw the corresponding exceptions: 
//     > if age is less than 18, throw an AgeException with the corresponding error message "You must be 18 or older to vote."
//     > if isCitizen is false, throw a CitizenshipException with the corresponding error message "Only citizens are allowed to vote."
//     > if isRegistered is false, 
//         (i) if firstTimeVoter is true, then create a FirstTimeVoterException with error message "First-time voters must register before voting."
//             and a RegistrationException with the error message "You must be registered to vote"
//             initialise the cause of the RegistrationException as the FirstTimeVoterException
//             throw the RegistrationException
//         (ii) else throw a RegistrationException with error message "You must be registered to vote"
//     > if none of the above conditions occur, then print out "You are eligible to vote".
//     > catch the appropriate exceptions and print out the corresponding error message.
//     > inside the catch, if there is a cause for the exception, print out the error message for the cause as well
//     > at the end, whether or not there was an exception, the program has to print out "Thank you for using our voter validation system!"
// define the exceptions:
//  >AgeException
//  >CitizenshipException
//  >RegistrationException
//  >FirstTimeVoterException
// Assume the test case inputs are meaningful, for example if citizenship itself is false, registration wont be true, etc...

import java.util.Scanner;

class AgeException extends Exception
{
    public AgeException(String message)
    {
        super(message);
    }
}

class CitizenshipException extends Exception
{
    public CitizenshipException(String message)
    {
        super(message);
    }
}

class RegistrationException extends Exception
{
    public RegistrationException(String message)
    {
        super(message);
    }
}

class FirstTimeVoterException extends Exception
{
    public FirstTimeVoterException(String message)
    {
        super(message);
    }
}

class Voter
{
    private int age;
    private boolean isCitizen;
    private boolean isRegistered;
    private boolean firstTimeVoter;

    public Voter(int age, boolean isCitizen, boolean isRegistered, boolean firstTimeVoter) 
    {
        this.age = age;
        this.isCitizen = isCitizen;
        this.isRegistered = isRegistered;
        this.firstTimeVoter = firstTimeVoter;
    }

    public void validateVoter() 
    {
        try
        {
            if(this.age < 18)
            {
                throw new AgeException("You must be 18 or older to vote.");
            }
            else if(!this.isCitizen)
            {
                throw new CitizenshipException("Only citizens are allowed to vote.");
            }
            else if(!this.isRegistered)
            {
                if(this.firstTimeVoter)
                {
                    RegistrationException re = new RegistrationException("You must be registered to vote");
                    re.initCause(new FirstTimeVoterException("First-time voters must register before voting."));
                    throw re;
                }
                else
                {
                    throw new RegistrationException("You must be registered to vote");
                }
            }
            else
            {
                System.out.println("You are eligible to vote");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            if(e.getCause()!=null)
            {
                System.out.println(e.getCause().getMessage());
            }
        }
        finally
        {
            System.out.println("Thank you for using our voter validation system!");
        }
    }
}


public class p66VoterValidation 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Are you a citizen (true/false): ");
        boolean isCitizen = input.nextBoolean();

        System.out.print("Are you registered to vote (true/false): ");
        boolean isRegistered = input.nextBoolean();

        System.out.print("Is this your first time voting (true/false): ");
        boolean firstTimeVoter = input.nextBoolean();

        Voter voter = new Voter(age, isCitizen, isRegistered, firstTimeVoter);
        voter.validateVoter();
        input.close();
    }
}