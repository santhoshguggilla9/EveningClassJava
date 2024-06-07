package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer,String> students = new HashMap<Integer,String>();
		
		//adding the entries (records)
		students.put(101, "santhosh");
		students.put(102, "raj");
		students.put(103, "kiran");
		students.put(104, "ram");
		students.put(105, "varun");
		
		//printing all the entries
		System.out.println(students);
		
		//print only the keys
		System.out.println(students.keySet());
		
		//print only values
		System.out.println(students.values());
		
		for(Map.Entry<Integer, String> entry : students.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		//converting map to set
		Set oneEntry = students.entrySet();
		
		Iterator itr = oneEntry.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> oneRecord = (Entry<Integer, String>) itr.next();
			System.out.println(oneRecord.getKey()+ " " + " " +oneRecord.getValue());
		}
	}
}

