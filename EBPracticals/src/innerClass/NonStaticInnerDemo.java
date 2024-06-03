package innerClass;

class outer
{
	private String message = "this is outer class";

	class inner
	{
		public void showMsg()
		{
			System.out.println(message);
		}
	}
}
public class NonStaticInnerDemo {

	public static void main(String[] args) {
		
		outer oobj = new outer();
		
		outer.inner iobj = oobj.new inner();/* we should create the object for inner class
		                                      using outer class name and object */
		iobj.showMsg();
		
		//oobj.showMsg();// we can not access the inner class members using outer class object. 
	}

}
