// Create a program to find number of occurrences of an element in an array.

public class p12Frequency 
{
  public static void main(String[] args) 
  {
      int arr[] = {1,7,4,3,9,2,5,1,9,2,6,1,7};

      frequency(arr);
  }


  // Count Occurence Of An Element
  public static void frequency(int[] arr)
  {
    int[] count = new int[10];

    for(int i = 0; i < 10; i++)
    {
      count[i] = 0;
    }

    for(int i = 0; i < arr.length; i++)
    {
      count[arr[i]]++;
    }

    display(count);
  }


  // Display Array
  public static void display(int[] count)
  {
    System.out.println("Number   |    Frequency");
    
    for(int i = 0;i < count.length; i++)
    {
      if(count[i] > 0)
      {
        System.out.printf("%d        |   %d\n",i,count[i]);
      }
    }
  } 

}
