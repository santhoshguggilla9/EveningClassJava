package basics;

class sample
{
	private int age;
	private String sname;
	
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String getSname() {
		return sname;
	}
	public int getAge() {
		return age;
	}
	
	
//	public void setVal(int a, String name)
//	{
//		age=a;
//		sname=name;
//	}
//	public void showVal()
//	{
//		System.out.println("age: " +age);
//		System.out.println("sname: " +sname);
//	}
	
	
	
}
public class GettersAndSetters {

	public static void main(String[] args) {
		
		sample s1 = new sample();
		
		s1.setAge(10);
		s1.setSname("santhosh");
		
		System.out.println(s1.getAge());
		System.out.println(s1.getSname());
	}
}
