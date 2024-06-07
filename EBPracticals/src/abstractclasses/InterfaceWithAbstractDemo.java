package abstractclasses;

interface inter1
{
	public void display();
}
interface inter2 extends inter1 // extending interface with another interface
{
	public void display2();
}

abstract class sample implements inter2 // implementing the interface with class
{
	abstract public void design();
}
class concrete extends sample // extending class with another class
{
	public void display() {
		System.out.println(" it is displaying");
	}
	public void design() {
		System.out.println(" it is designing");
	}
	public void display2() {
		System.out.println(" it is displaying 2");
	}
}
public class InterfaceWithAbstractDemo {

	public static void main(String[] args) {
	
		concrete cobj = new concrete();
		cobj.design();
		cobj.display();
	}
}
