package classesAndObjects;

//method with arguments, with return type
public class FirstClass {

	public static void main(String[] args) {
		
		int x,y;
		
		x=10;
		y=20;
		
		int res= sum(x,y); // calling the sum method (x,y are arguments)
		System.out.println("sum: " +res);
	}
	public static int sum(int i, int j) //method definition (i,j are parameters)
	{
		int sum;
		
		sum=i+j;
		return sum; // return is keyword, it will return a single value at a time
	}
}
