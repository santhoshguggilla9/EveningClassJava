package abstractclasses;


abstract class bike
{
	//abstract method
	abstract public void run();
	
	// normal method
	public void mileage()
	{
		System.out.println("Bike has the good mileage");
	}
	
}
//Concrete class - it is a class that implements the abstract class methods.  
class honda extends bike
{
	public void run() {
		System.out.println("Honda bike is running");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		
		honda hobj = new honda();
		hobj.mileage();
		hobj.run();
	}

}
