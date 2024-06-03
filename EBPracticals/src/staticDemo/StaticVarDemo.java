package staticDemo;

class staticExample
{
	static int staticX = 1000;
	private int x;
	
	public void printVal(int i)
	{
		x=i;
		
		System.out.println("non static x: " +x);
		System.out.println("Static x: " +staticX);
		System.out.println("........................");
	}
	
}
public class StaticVarDemo {

	public static void main(String[] args) {
		
			staticExample e1 = new staticExample();
			staticExample e2 = new staticExample();
			staticExample e3 = new staticExample();
			
			staticExample.staticX = 3000; /* since static memory allocating in 
			class memory we can use the class name to access the static varaible.*/
			
			e1.printVal(10);
			e2.printVal(20);
			e3.printVal(30);
	}
}
