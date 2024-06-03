package constructor;

class calc
{
	// Constructor overloading
	calc(int x, int y)
	{
		System.out.println("sum: " +x+y);
	}
	calc(double x, String name)
	{
		System.out.println("x: " + x +"name: " +name);
	}
	
	//method overloading
	public void sum(int x, int y)
	{
		System.out.println(x+y);
	}
	public void sum(String x, float y)
	{
		System.out.println("name: " + x +"x: " + y);
	}
}
public class ConstOverloadDemo {

	public static void main(String[] args) {
		
		calc c = new calc(10,20);
		calc c1 = new calc(10.25,"santhosh");
		
		c.sum(10, 20);
		c1.sum("raj", 20);
	}

}
