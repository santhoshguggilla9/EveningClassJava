package exceptions;

public class BasicExceptionExample {

	public static void main(String[] args) {
		
		
	try
	{
		int x,y;
		
		x=100;
		y=50;
		
		int div = x/y; // Arithemetic Exception
		
		System.out.println("the result is: " +div);
	}
	catch(ArithmeticException e)
	{
		System.out.println("this feature is not working sometime..");
	}
	finally
	{
		System.out.println("this is finally");
	}
	System.out.println("This is the end of programm");
	}
}
