package collections;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {
		
//		SortedMap<Integer, String> sobj = new TreeMap<Integer, String>();
//		
//		sobj.put(104, "Banana");
//		sobj.put(105, "Cherry");
//		sobj.put(102, "Apple");
//		sobj.put(103, "Mango");
//		sobj.put(101, "Kiwi");
		
		SortedMap<String, Integer> sobj = new TreeMap<String, Integer>();
		
		sobj.put("Banana",102);
		sobj.put("Cherry",103);
		sobj.put("Apple",104);
		sobj.put("Mango",101);
		sobj.put("Kiwi",105);
		
		System.out.println(sobj.keySet());
		
		System.out.println(sobj.values());
		
		System.out.println(sobj.entrySet());
		
		for(Map.Entry<String, Integer> entry : sobj.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
