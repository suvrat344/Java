// Create a program to merge two sorted arrays.

public class p18MergeSortedArray 
{
  public static void main(String[] args) 
  {
      int arr1[] = {2,5},arr2[] = {1,3,4,7};

      mergeArray(arr1,arr2);
  }



  // Merge Sorted Array
  public static void mergeArray(int[] arr1,int[] arr2)
  {
    int len1 = arr1.length,len2 = arr2.length;
    int i = 0 , j = 0,pos = 0;
    int MergeArray[] = new int[len1 + len2];

    while(pos < len1 + len2)
    {
      if(j == len2 || (i < len1  && arr1[i] < arr2[j]))
      {
        MergeArray[pos++] = arr1[i++]; 
      }
      else
      {
        MergeArray[pos++] = arr2[j++];
      }
    }

    displayArray(MergeArray);
  }


  // Display Array
  public static void displayArray(int[] arr)
  {
    for(int i = 0;i < arr.length;i++)
    {
      System.out.print(arr[i] + " ");
    }
  }
}
