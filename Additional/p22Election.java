// Both the Voter and EVM classes must be created in such a way that they enforce the existence of only a single instance at a time. Each Voter object must be mapped with a unique EVM object and vice versa. A Voter must be allocated an EVM and then the voting process should start, once voting is completed that particular EVM should be freed and the next voter should be called.
// Again a new EVM must be allocated to the next voter like previously and the process continues till all the voters cast their votes.

import java.util.Scanner;	

class Voter
{	
	public static int total_no_of_voters;
	private static Voter new_voter;
	private static int current_voter_count = 0;
	
	private Voter() 
	{                           
		current_voter_count++;					
	}

	public static Voter getVoter() 
	{
		if(new_voter == null)
		{
			new_voter = new Voter();
			return new_voter;
		}
		else
		{
			return null;
		}
	}

	public void firstVoter()
	{
		if(new_voter != null) 
		{
			EVM new_machine = EVM.getEVM(new_voter);
			new_machine.startVoting();
		}
	}

	public void callNewVoter() 
	{
		new_voter = null;
		System.out.println("Voting completed for voter " + current_voter_count);

		if(current_voter_count < total_no_of_voters)
		{
			EVM new_machine = EVM.getEVM(getVoter());
			try 
			{
				EVM x = EVM.getEVM(null);
					x.startVoting();
			}
			catch(NullPointerException e) 
			{
				System.out.println("EVM is Singleton");
			}
			new_machine.startVoting();
		}
	}
}


class EVM
{
	private Voter current_voter;
	private static int evm_count = 0;
	private static EVM current_evm;

	private EVM(Voter v) 
	{
		this.current_voter = v;
		evm_count++;
	}
	public static EVM getEVM(Voter v) 
	{
		if(current_evm == null)
		{
			current_evm = new EVM(v);
			return current_evm;
		}
		else
		{
			return null;
		}
	}

	public void startVoting() 
	{
		System.out.println("voting under process on EVM number " + evm_count);
		current_evm = null;
		current_voter.callNewVoter();
	}
}


public class p22Election
{
	public static void main(String args[]) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter total number of voter : ");
		Voter.total_no_of_voters =  input.nextInt();

		Voter v = Voter.getVoter();

		try 
		{
			Voter x = Voter.getVoter();
			x.callNewVoter();
		} 
		catch(NullPointerException e) 
		{
			System.out.println("Voter is Singleton");
		}

		v.firstVoter();
	}
}