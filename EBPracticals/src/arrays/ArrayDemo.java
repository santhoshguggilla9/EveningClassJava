package arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int [] myArray; // Creation of the Array
		myArray = new int[5]; // allocating memory to an array
		
		int key=40, search=0;
		
		//Assigning the value to an array
		myArray[0]= 10;
		myArray[1]= 20;
		myArray[2]= 30;
		myArray[3]= 40;
		myArray[4]= 50;
		
		System.out.println("length of the array: " +myArray.length);
		
		//iterating the values through the array
		for(int i=0;i<myArray.length;i++)
		{
			if(myArray[i]==key)
			search=key;
			else
			search=0;
		}
		if(search==key)
		System.out.println("Value found: " +search);
		else
		System.out.println("Value not found");
	}

}
