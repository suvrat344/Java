// Take an array of words and concatenate them into a single string using StringBuilder.

public class p33ConcatenateArrayIntoString
{
  public static void main(String[] args) 
  {

      String[] arr = new String[] {"This"," is"," a"," java"," folder."};
      StringBuilder sentence = new StringBuilder();

      for(int i = 0;i < arr.length; i++)
      {
        sentence.append(arr[i]);
      }
      System.out.print("Entered string : " + sentence);
  }
}
