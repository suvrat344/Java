// The Java program below takes as input the names of cricket players in a team and the runs scored by each of them in 3 consecutive matches. The program is supposed to print the names of those players who have scored at least 80 runs in all the matches. Complete the code to obtain the specified output.
// Class Team has the following members:
//  • Instance variable Map<String, ArrayList<Integer>> playerMap (maps the player name to the list of runs scored by him/her in each match).
//  • Aconstructor to initialize the instance variable.
//  • An accessor method to access the instance variable.
// Class p71Player has the following members:
//  • Amethod getFinalList( ) that accepts an object of class Team as input and returns
//  the list of player names who has/have scored at least 80 runs in all the matches.
//  • main( ) method does the following:
//    – accepts inputs to instantiate an object of Team. The input is accepted in the order- player name followed by the list of his/her runs.
//    – invokes method getFinalList() by passing an object of Team as input, to return the list of player names who has/have scored at least 80 runs in all the matches.
//    – prints the list returned by the method getFinalList()
//  What you have to do
//  • Define method getFinalList() of class FClass
// Input:
//  Ravi 76 76 76
//  sonu 80 80 89
//  viral 98 47 99
//  Output:
//  [sonu]


import java.util.*;

class Team
{
  private Map<String, ArrayList<Integer>> playerMap;

  public Team( Map<String, ArrayList<Integer>> m) 
  {
    playerMap = m;
  }
  
  public Map<String, ArrayList<Integer>> getPlayerMap()
  {
    return playerMap;
  }
}

public class p71Player
{
  public static ArrayList<String> getFinalList(Team t) 
  {
    ArrayList<String> name = new ArrayList<>();
    Map<String,ArrayList<Integer>> player = t.getPlayerMap();
    for(String playerName : player.keySet())
    {
      Boolean flag = true;
      for(Integer runs : player.get(playerName))
      {
        if(runs < 80)
        {
          flag = false;
          break;
        }
      }
      if(flag)
      {
        name.add(playerName);
      }
    }
    return name;
  }

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    Map<String,ArrayList<Integer>> pmap = new LinkedHashMap<String, ArrayList<Integer>>();
    for(int i= 0;i <3; i++)
    {
      ArrayList<Integer> pruns =new ArrayList<Integer>();
      String name = input.next();
      for(int j = 0;j < 3; j++)
      {
        pruns.add(input.nextInt());
      }
      pmap.put(name,pruns);
    }
    Team t= new Team(pmap);
    System.out.println(getFinalList(t));
  }
}
