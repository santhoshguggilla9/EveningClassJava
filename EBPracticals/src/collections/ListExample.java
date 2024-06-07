package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class student
{
	private int age;
	private String sname;
	
	student(int age, String sname)
	{
		this.age=age;
		this.sname=sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
}
public class ListExample {

	public static void main(String[] args) {
		
		student s1 = new student(25,"santhosh");
		student s2 = new student(35,"raj");
		student s3 = new student(45,"ram");
		
		//adding object to the list
		List<student> studentList = new ArrayList<student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
	
		//using iterator method
		Iterator<student> itr = studentList.iterator();
		
		//get the element from list
		while(itr.hasNext())
		{
			student s = itr.next();
			System.out.println(s.getAge() + " " + s.getSname());
		}
	}
}
