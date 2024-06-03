package interfaces;

interface animal
{
	public void makeSound();
	public void run();
}
class tiger implements animal
{
	@Override
	public void makeSound() {
		System.out.println("Tiger shouts");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
}
class dog implements animal
{

	@Override
	public void makeSound() {
		System.out.println("dog woofs");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
}
class cat implements animal
{
	@Override
	public void makeSound() {
		System.out.println("Cat Meow");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
}
public class SampleInterface {

	public static void main(String[] args) {
		
		cat c = new cat();
		dog d = new dog();
		tiger t = new tiger();
		
		c.makeSound();
		d.makeSound();
		t.makeSound();

	}

}
