package inheritance;

class human
{
	public void walk()
	{
		System.out.println("walking....");
	}
}
class raj extends human
{
	public void run()
	{
		System.out.println("Running....");
	}
}
class ram extends raj
{
	public void sleep()
	{
		System.out.println("sleeping....");
	}
}
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		 
		ram robj = new ram();
		robj.sleep();
		robj.run();
		robj.walk();
		
	}

}
