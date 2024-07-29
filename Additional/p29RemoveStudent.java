// Complete the Java code below that takes a  Map object as input, and removes key-value pairs from the object that satisfy the defined property. The program should accept 6 key-value pairs, and add those to a Map object. Each key is the name of a student and is of type String, whereas the corresponding value is the attendance of that student and is of type  Double. Assume that the student names are not repeated. 
//  For each key-value pair, if the value satisfies the condition given in the property() method, then the detained(Map<String, Double> obj) method should remove the key-value pair from the Map object. 
//  After making all the updates, the detained(Map<String, Double> obj) method should invoke the display(Map<String, Double> obj) method to print the names and the attendance of the students who have not been removed from the Map object, in the format shown in the public test cases.

import java.util.*;

class RemoveStudent
{
	public boolean property(Double value) 
	{
		if(value<65)
		{
			return true;
		}
		else
		{
			return false;
		}			
	}

	public void detained(Map<String, Double> obj) 
	{
		Iterator<Map.Entry<String,Double>> iterator = obj.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry<String,Double> entry = iterator.next();
			String key = entry.getKey();
			Double value = entry.getValue();
			if(property(value))
			{
				iterator.remove();
			}
		}
		display(obj);
	}

	public void display(Map<String, Double> obj) 
	{
				System.out.println(obj);
	}
}


public class p29RemoveStudent 
{
	public static void main(String[] args) 
	{
		Map<String,Double> map = new TreeMap<>();

		map.put("virat",23.0);
		map.put("johny",78.9);
		map.put("suchith",56.9);
		map.put("juhee",45.00);
		map.put("karthik",90.0);
		map.put("shannu",67.0);

		RemoveStudent obj = new RemoveStudent();
		obj.detained(map);
	}
}
