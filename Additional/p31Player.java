// Given as input a set of four objects of class CricketPlayer complete the Java code to segregate the players represented by these objects into batsmen and bowlers.
// Create an ArrayList object to store the four objects of CricketPlayer. Segregate them as batsmen and bowlers based on the following criteria: 
// A player is termed as a batsman if his/her average runs per match are greater than 25.
// A player is termed as a bowler if his/her average wickets per match are greater than 1.
// Create ArrayList bt to store the batsmen and ArrayList bw to store the bowlers. Observe that the same player could belong to both the lists. 
// Print the list of bowlers in a line, followed by the list of batsmen in the next line, using the displayPlayers(ArrayList<CricketPlayer> bw, ArrayList<CricketPlayer> bt) method.

import java.util.*;

class CricketPlayer
{
  private String name;
  private int wickets;
  private int runs;
  private int matches;

  public CricketPlayer(String s, int w, int r, int m)
  {
    this.name = s;
    this.wickets = w;
    this.runs = r;
    this.matches = m;
  }
  public String getName()
  {
    return this.name;
  }
  public int getWickets()
  {
    return this.wickets;
  }
  public int getRuns()
  {
    return this.runs;
  }
  public double avgRuns()
  {
    return runs/matches;
  }
  public double avgWickets()
  {
    return wickets/matches;
  }
} 


public class p31Player 
{
  static void displayPlayers(List<CricketPlayer> bw,List<CricketPlayer> bt)
  {
    for(CricketPlayer p : bw)
    {
      System.out.print(p.getName() + " ");
    }

    System.out.println();
    for(int i = 0;i < bt.size();i++)
    {
      System.out.print(p.getName + " ");
    }
  }

  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    CricketPlayer p1 = new CricketPlayer("Dhoni",11,11000,347);
    CricketPlayer p2 = new CricketPlayer("Kohli",10,12285,257);
    CricketPlayer p3 = new CricketPlayer("Ashwin",181,1000,90);
    CricketPlayer p4 = new CricketPlayer("Bumrah",130,50,60);


    List<CricketPlayer> player = new ArrayList<>();
    player.add(p1);
    player.add(p2);
    player.add(p3);
    player.add(p4);

    List<CricketPlayer> bw = new ArrayList<>();
    List<CricketPlayer> bt = new ArrayList<>();

    for (CricketPlayer p : player) 
    {

        if(p.avgRuns() > 25)
        {
          bt.add(p);
        }

        if(p.avgWickets() > 1)
        {
          bw.add(p);
        }
    }
    displayPlayers(bw, bt);
  }
}  
