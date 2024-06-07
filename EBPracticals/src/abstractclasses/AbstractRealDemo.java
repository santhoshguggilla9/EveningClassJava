package abstractclasses;

abstract class vehicle
{
	private String bname;
	
	vehicle(String bname)
	{
		this.bname = bname;
	}

	public String getBname() {
		return bname;
	}
	public abstract void start(); 
	public abstract void stop();
}
class car extends vehicle // IS - A relation ship : Concrete class
{
	car(String name)
	{
		super(name);
	}
	public void start() {
		System.out.println(getBname() + " is started");
	}
	public void stop() {
		System.out.println(getBname() + " is stopped");
	}
}
class Bicycle extends vehicle
{
	Bicycle(String name) 
	{
		super(name);
	}
	public void start() {
		System.out.println(getBname() + " is started");
	}
	public void stop() {
		System.out.println(getBname() + " is stopped");
	}
}
public class AbstractRealDemo {

	public static void main(String[] args) {
		
		Bicycle bobj = new Bicycle("Trek Cycle");
		
		bobj.start();
		bobj.stop();
		
		car cobj = new car("Hyndai");
		
		cobj.start();
		cobj.stop();
	}
}
