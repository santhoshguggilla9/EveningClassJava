package advanceTopics;

class A
{
	public void display()
	{
		System.out.println("this is display of A");
	}
}
class B extends A
{
	public void display()
	{
		System.out.println("this is display of B");
	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		
		A obj = new B();
		obj.display();
		
		obj = new A(); // Dynamic Dispatch ( Runtime Polymorphism )
		obj.display();
	}
}
