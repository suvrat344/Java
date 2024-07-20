// 


import java.util.*;

interface Searchable
{
    public int search(int start_index, Object key);
}

class Char
{
    private char c;
    public Char(char c_) 
    {
        this.c = c_;
    }
    public boolean equals(Object d) 
    {
//implement equals() for Char
    }
}

class CharArray implements Searchable
{
    private Char[] carr;
    public CharArray(Char[] carr_)
    {
        this.carr = carr_;
    }
    public int search(int start_index, Object key) 
    {
        //search the key in array carr from the index start_index
        //if the key found, return index of the first occurrence of the key
        //else return -1
        if(carr[start_index] == key)
        {
          return start_index;
        }
        else
        {
          return -1;
        }
    }
}

class FrequencyCounter
{
  public static int getFrequency(Searchable ob, Object key)
  {
    int index=0,counter=0;
    if (ob instanceof CharArray) 
    {
      do
      {
        index = ob.search(index,key);
        if(index != -1)
        {
          counter++;
        }
      }while(index != -1);
    }
    else
    {
        return 0;
    }
    return counter;
  }
}

public class p21
{
    public static void main(String[] args) 
    {
        String str;
        char c;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        c = input.next().charAt(0);
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
