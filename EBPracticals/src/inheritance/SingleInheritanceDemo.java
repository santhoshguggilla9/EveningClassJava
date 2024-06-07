package inheritance;

class parent
{
	public void show()
	{
		System.out.println("it is a show");
	}
	public void design()
	{
		System.out.println("it is a show");
	}
}
class child extends parent
{
	public void display() 
	{
		System.out.println("it is display");
	}
}
public class SingleInheritanceDemo 
{

	public static void main(String[] args) 
	{
		child cobj = new child();
		
		cobj.display();
		cobj.design();
		cobj.show();
		
	}

}
