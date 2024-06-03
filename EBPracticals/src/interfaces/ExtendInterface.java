package interfaces;

interface act
{
	public void acting();
}
interface actor extends act //HAS-A
{
	public void play();
}
class amitab implements actor //IS-A
{
	@Override
	public void acting() {
		System.out.println("he can act");
		
	}
	@Override
	public void play() {
		System.out.println("he can play");
	}
}
public class ExtendInterface {

	public static void main(String[] args) {
		
		amitab a = new amitab();
		a.acting();
		a.play();
	}
}
