package innerClass;

class outer2
{
	public void display()
	{
		class localClass
		{
			void showMsg()
			{
				System.out.println("This is Local class");
			}
		}
		localClass loc = new localClass();
		loc.showMsg();
	}
}

public class LocalInnerDemo {

	public static void main(String[] args) {
		
		outer2 oobj = new outer2();
		oobj.display();
	}

}
