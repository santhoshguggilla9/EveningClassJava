package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashsetExample {

	public static void main(String[] args) {
		
		HashSet<Integer> nums = new HashSet<Integer>();
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		nums.add(null);// we can add null value to the set
		
		System.out.println(nums); // un-ordered set
		
		//Collections.sort(nums);// we cannnot sort the hashset
		
//		List<Integer> list = new ArrayList(nums); //converted set to list
//		
//		Collections.sort(list);
//		System.out.println(list);//ordered list
//		
		
		
	}

}
