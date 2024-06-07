package abstractclasses;

 class bikee
{
	private final int speed_limit = 100;
	
	final public void run()
	{
		//speed_limit = 400; // changes are not allowed to the final
		System.out.println("speed limit: " + speed_limit);
	}
}
class hondaa extends bikee // can not extend the final class
{
	public void runn() // can not override the final methods
	{
		//speed_limit = 400; // changes are not allowed to the final
		System.out.println("Honda is running");
	}
}
public class FinalExample {

	public static void main(String[] args) {
		
		bikee bobj = new bikee();
		bobj.run();
	}
}
