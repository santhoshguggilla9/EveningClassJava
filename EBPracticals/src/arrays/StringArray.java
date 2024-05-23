package arrays;

public class StringArray {

	public static void main(String[] args) {
		
		String [] fruits = { "apple", "mango", "kiwi" };
		
		//System.out.println(fruits[1]);
		
		//simple for loop
//		for(int i=0;i<fruits.length;i++)
//			System.out.println(fruits[i]);
		
		//enhanced for loop
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
			

	}

}
