// Write a method concatenate Strings that takes variable arguments of String type and concatenates them into a single string

class concatenate
{
  public String merge(String ...args)
  {
    StringBuilder mergeString = new StringBuilder();
    for (String element : args) 
    {
      mergeString.append(element).append(" ");
    }
    return mergeString.toString();
  }
}

public class p11StringConcatenate
{
  public static void main(String[] args)
  {
    concatenate c = new concatenate();
    System.out.print("String after merging : " + c.merge("Ram","Ravi","Shyam"));
  }
}