package inheritance;

class main
{
	main() // first it will class main class constructor then sub class
	{
		System.out.println("this is main class constructor");
	}
}
class sub extends main
{
	sub()
	{
		System.out.println("this is sub class constructor");
	}
}
public class ConstructorInheritanceDemo {

	public static void main(String[] args) {
		
			sub sobj = new sub(); 
	}
}
