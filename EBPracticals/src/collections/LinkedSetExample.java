package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> nums = new LinkedHashSet<Integer>();
		
		try
		{
			nums.add(10);
			nums.add(20);
			nums.add(30);
			nums.add(40);
			nums.add(50);
			nums.add(null);// we can add null value to the set
			
			System.out.println(nums); // un-ordered set
			
			Iterator<Integer> itr = nums.iterator();
			while(itr.hasNext())
			{
				int n = itr.next();
				System.out.println(n);
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("it is an exception of null value");
		}
	}
}
