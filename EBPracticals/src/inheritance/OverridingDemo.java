package inheritance;

class bank
{
	int b_code=1101;
}
class trans extends bank
{
	int b_code=1201;
	public void display()
	{
		System.out.println("bank class: " +super.b_code);
		System.out.println("trans class: "  +b_code);
	}
	
}
public class OverridingDemo {

	public static void main(String[] args)  {
			
		trans tobj = new trans();
		tobj.display();

	}

}
