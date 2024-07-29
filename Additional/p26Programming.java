// Complete the Java code given below that takes as input a string array, where each string is assured to be either an integer or a double in string format. Your code must segregate the two types - integer and double - and print the double values followed by the integer values. For this, your code must iterate through the input array, and add each element to the appropriate array based on its type. 
 
import java.util.*;

class ConvertArrays
{
	public Double doubleArr[] = new Double[3];
	public Integer intArr[] = new Integer[3];
	public int x=0,y=0,z=0;

	public void convert(String[] arr)
	{
		for (String element : arr) 
		{
			if(isInteger(element))
			{
				intArr[x++] = Integer.parseInt(element);
			}
			else
			{
				doubleArr[y++] = Double.parseDouble(element);
			}
		}
	}

	public static Boolean isInteger(String ele)
	{
		boolean result = true;
		for (int i = 0; i < ele.length(); i++) 
		{
				if(ele.charAt(i) == '.'){
					result = false;
					return result;
				}
		}
		return result;
	}

	public <T> void display(T[] arr)
	{
		for(T elements : arr)
		{
			System.out.print(elements+" ");
		}
		System.out.println();
	}
}


public class p26Programming 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String arr[]= new String[6];

		for (int i = 0; i < arr.length; i++) 
		{
					arr[i] = input.next();
		}

		ConvertArrays conArrays = new ConvertArrays();
		conArrays.convert(arr);

		System.out.println("===After conversion Arrays===");
		conArrays.display(conArrays.doubleArr);
		conArrays.display(conArrays.intArr);	  
	}
}