package arrays;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		
		//initialisation of an array 
		int [ ] [ ] jaggedArray={
			    new int[] {1, 2},
			    new int[] {3, 4, 5},
			    new int[] {6}
			};
		
;

//		//Allocating the memory for array
//		jaggedArray = new int[3][]; // creates a jagged array with 3 rows
//		jaggedArray[0] = new int[2]; // first row has 2 elements
//		jaggedArray[1] = new int[3]; // second row has 3 elements
//		jaggedArray[2] = new int[1]; // third row has 1 element

		System.out.println("array value: " +jaggedArray[1][1]);
		System.out.println("array value: " +jaggedArray[2][0]);
		
		
	}

}
