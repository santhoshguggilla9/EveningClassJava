package inheritance;

interface A
{
	public void showA();
	
}
class B implements A
{
	public void showB()
	{
		System.out.println("showing B");
	}
	public void showA()
	{
		System.out.println("showing A");
	}
}

public class BindingDemo {

	public static void main(String[] args) {
		
		A bobj = new B(); // Runtime binding
		bobj.showA();
		((B) bobj).showB(); // casting the object from A to B
		

	}

}
