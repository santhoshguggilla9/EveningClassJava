package inheritance;

class student
{
	int age;
	String sname;
	student(int a, String s)
	{
		age=a;
		sname=s;
	}
	public void showStudent()
	{
		System.out.println("Student name: " +sname);
		System.out.println("Student age: " +age);
	}
}
class marks extends student
{
	int m1,m2,tot;
	
	marks()
	{
		super(23,"santhosh"); // calling super class constructor using super method
		m1=67;
		m2=77;
		tot = m1+m2;
	}
	public void showMarks()
	{
		System.out.println("Student Marks: " + m1 + " " + m2);
		System.out.println("Student total: " +tot);
	}
}
public class ConstructorOvrDemo {

	public static void main(String[] args) {
		
		marks mobj = new marks();
		mobj.showStudent();
		mobj.showMarks();

	}

}
