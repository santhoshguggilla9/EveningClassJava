package staticDemo;

class staticMethodExample
{
	static int code=1001;
	int x;
	
	static // calls the static block when the class is loaded in the class loader
	{
		code=1005;
		//System.out.println("x: " +x); // inside static only static varaible are allowed
		System.out.println("static varaible code: " + code);
	}
	public static void printCode()
	{
		System.out.println("calling static method");
	}
	public void printX()
	{
		x=10;
		System.out.println("x value:" +x);
	}
}
public class StaticMethodDemo {

	public static void main(String[] args) {
		
		new staticMethodExample().printCode(); // we can call static method while allcating the memory
		new staticMethodExample().printX(); // anonymous object

	}

}
