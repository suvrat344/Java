// Write a function to count the occurence of particular key in given string.


import java.util.*;

interface Searchable
{
    public int search(int start_index, Object key);
}

class Char
{
    private char c;
    public Char(char c) 
    {
        this.c = c;
    }

    @Override
    public boolean equals(Object d) 
    {
      if (d instanceof Char) 
      {
        if (((Char) d).c == this.c)
          return true;
      }   
      return false;
    }

    @Override
    public int hashCode()
    {
      return Character.hashCode(c);
    }
}

class CharArray implements Searchable
{
    private Char[] carr;
    public CharArray(Char[] carr)
    {
        this.carr = carr;
    }

    @Override
    public int search(int start_index, Object key) 
    {
      for(int i = start_index;i < carr.length;i++)
      {
        if(carr[i].equals(key))
        {
          return i;
        }
      }
      return -1;
    }
}

class FrequencyCounter
{
  public static int getFrequency(Searchable ob, Object key)
  {
    if (ob instanceof CharArray) 
    {
      int counter = -1,index = -1;
      do
      {
        counter++;
        index = ob.search(index + 1,(Char) key);  
      }while(index != -1);
      return counter;
    }
    else
    {
      return 0;
    }
  }
}

public class p21CharacterOperation
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string : ");
        String str = input.nextLine();     

        System.out.print("Enter character to be searched : ");
        char c = input.next().charAt(0);    

        Char key = new Char(c);
        Char[] cA = new Char[str.length()]; 

        for(int i = 0; i < str.length(); i++) 
        {
            cA[i] = new Char(str.charAt(i));
        }
        CharArray caObj = new CharArray(cA);
        System.out.println(FrequencyCounter.getFrequency(caObj, key));
    }
}
