package classesAndObjects;

class person
{
	private int age;
	private String sname;
	
	person(int age, String sname)
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
public class ArrayOfObjects {

	public static void main(String[] args) {
		
		person [] people;
		people = new person[3]; // Instantiating the array
		
		people[0] = new person(10,"santhosh"); // Initialising the element of array
		people[1] = new person(25,"raj");
		people[2] = new person(53,"ram");
		
//		System.out.println(people[0].getAge() + " " + people[0].getSname());
//		System.out.println(people[1].getAge() + " " + people[1].getSname());
//		System.out.println(people[2].getAge() + " " + people[2].getSname());
		
//		for(int i=0;i<people.length;i++) {
//			System.out.println(people[i].getAge() + " " + people[i].getSname());
//		}
		for(person p : people)
		{
			System.out.println(p.getAge() + " " + p.getSname());
		}
	}

}
