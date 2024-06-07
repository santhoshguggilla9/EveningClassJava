package inheritance;

class animal
{
	public void sound()
	{
		System.out.println("it is sounding");
	}
}
class dog extends animal
{
	public void bark()
	{
		System.out.println("dog is barking");
	}
}
class cat extends animal
{
	public void meow()
	{
		System.out.println("cat is shouting");
	}
}

public class HeirarchalInheritanceDemo {

	public static void main(String[] args) {
		
		cat cobj = new cat();
		
		cobj.meow();
		cobj.sound();
		
		//cobj.bark();// not allowed
	}

}
