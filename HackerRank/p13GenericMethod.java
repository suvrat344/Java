// Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

public class p13GenericMethod 
{

    public static void main(String[] args) 
    {
        Integer[] arr = new Integer[]{1,2,3,4,5};
        String[] arr1 = new String[]{"Hello","World","America"};

        printArray(arr);
        printArray(arr1);
    }
    
    public static <T> void printArray(T[] arr)
    {
        for(T element : arr)
        {
            System.out.println(element);
        }
    }
}

