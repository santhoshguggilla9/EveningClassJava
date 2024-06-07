package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistExample {

	public static void main(String[] args) {
		// creation of arraylist object : creating a reference for List interface and allocates memory for arraylist
				LinkedList<String> fruits = new LinkedList<String>();
				
				// adding elements to the list
				fruits.add("kiwi");
				fruits.add("apple");
				fruits.add("banana");
				fruits.add("orange");
				fruits.add("orange");
				
				System.out.println("Fruits are: " +fruits);
				
				// adding element at specific index
				fruits.add(2, "mango");
				System.out.println("Fruits are: " +fruits);
				
				System.out.println("element at the index 3: " +fruits.get(3));
				
				fruits.remove(2);
				System.out.println("Fruits are: " +fruits);
				
				fruits.set(3, "mango");
				System.out.println("Fruits are: " +fruits);
				
				System.out.println("the size of the list: " +fruits.size());
				
				for(String fruit : fruits)
				{
					System.out.println(fruit);
				}
				
				//fruits.clear(); // removes all the elements
				
				Collections.sort(fruits); // sorting elements in the list
				System.out.println(fruits);
	}

}
