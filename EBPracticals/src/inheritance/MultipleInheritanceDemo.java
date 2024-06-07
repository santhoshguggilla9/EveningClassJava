package inheritance;

interface animals
{
	public void eat();
}
class dogg 
{
	public void shout() 
	{
		System.out.println("it is shouting");	
	}
}
class elephant extends dogg implements animals // class can extend and can implement at a time
{
	public void sleep() 
	{
		System.out.println("it is sleep");	
	}
	public void eat() {
		System.out.println("it is eating");
	}
}
public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		
		elephant eobj = new elephant();
		eobj.sleep();
		eobj.shout();
		eobj.eat();
	}
}
