// Create a program to check is the array is palindrome or not

public class p17CheckPallindrome 
{
  public static void main(String[] args) 
  {
      int[] arr = {1,2,3,4,3,2,1};

      boolean pallindrome = IsPallindrome(arr);

      if(pallindrome == true)
      {
        System.out.print("Array is pallindrome");
      }
      else
      {
        System.out.print("Array is not pallindrome");
      }
  }


  public static boolean IsPallindrome(int[] arr)
  {
    boolean isPallindrome = true;
    int len = arr.length;

    for(int i = 0; i < len / 2 ; i++)
    {
      if(arr[i] != arr[len - i - 1])
      {
        isPallindrome = false;
        break;
      }
    }
    return isPallindrome;
  }
}
