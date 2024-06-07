package abstractclasses;

sealed interface abc permits axis
{
	public void abcd();
}

sealed class bank permits axis,sbi
{
	public void setInterest()
	{
		System.out.println("Interest rate is 10%");
	}
}
final class sbi extends bank
{
	
}
non-sealed class axis extends bank implements abc
{
	public void setInterest()
	{
		System.out.println("Interest rate is 25%");
	}
	public void newInterest()
	{
		System.out.println("New Interest rate is 25%");
	}
	@Override
	public void abcd() {
		System.out.println(" this is abcd method");
	}
}

public class SealedClassDemo {

	public static void main(String[] args) {
		
		axis aobj = new axis();
		aobj.setInterest();
	}

}
