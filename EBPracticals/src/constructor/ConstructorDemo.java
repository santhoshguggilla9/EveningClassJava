package constructor;

class student
{
	
	private int rno,coll_id;
	private int age;
	private String sname;

	student(){};// Dummy constructor , it will create automatically by the JVM.
	student(int r, int cid, int a, String name)
	{
		rno=r;
		coll_id=cid;
		age=a;
		sname=name;
	}
	
	student(int r, int a, String name)
	{
		rno =r;
		age=a;
		sname=name;
	}
	public void design()
	{
		System.out.println("importent");
	}
	public void dispay()
	{
		System.out.println("roll no: " +rno);
		System.out.println("college code: " +coll_id);
		System.out.println("age: " +age);
		System.out.println("sname: " +sname);
		System.out.println(".......................");
	}
}
public class ConstructorDemo 
{
	public static void main(String[] args) 
	{
		student s1 = new student();
		student s2 = new student(2, 1011, 25, "santhosh");
		student s3 = new student(3, 33, "ram");
				
		s1.design();
		s1.dispay();
		s2.dispay();
		s3.dispay();
		
	}
}
