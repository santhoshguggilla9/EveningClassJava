package misc;

class college
{
	private int admno;
	private String name;
	
	college()
	{
	     this(10, "santhosh");	
	}
	college(int admno, String name)
	{
		this.admno=admno; // invoking on instance varaibles
		this.name=name;
	}
	public void showCollege()
	{
		System.out.println("admno: " +admno);
		System.out.println("name: " +name);
	}
	public college getStudent()
	{
		return this;
	}
}
public class ThisDemo {

	public static void main(String[] args) {
		
		college c1 = new college();
		college c2 = c1.getStudent(); 
	
		c1.showCollege();
		c2.showCollege();
		
	}
}
