package innerClass;

class anonymous
{
	public void showAnon()
	{
		System.out.println("Show anon called");
	}
}

public class AnonymousInnerDemo {

	public static void main(String[] args) {
		
			anonymous any = new anonymous()
							{
									public void showAnon()
									{
										System.out.println("adding a new meaning");
									}
					
							};
							any.showAnon();
	}
}
