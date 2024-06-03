package innerClass;


class outer1
{
	private static String message = "this is outer class";
	
	static class inner
	{
		public void showMsg()
		{
			System.out.println(message);
		}
	}
}

public class StaticInnerDemo {

	public static void main(String[] args) {
		
			outer1.inner iobj = new outer1.inner();
			iobj.showMsg();
	}
}
