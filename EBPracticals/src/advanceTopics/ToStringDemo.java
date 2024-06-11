package advanceTopics;

class human
{
	private int age;
	private String name;
	
	public human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "human [age=" + age + ", name=" + name + "]";
	}
}
public class ToStringDemo {

	public static void main(String[] args) {
		
		human h1 = new human(10,"santhosh");
		human h2 = h1; // assigning h1 state(values) to h2
		
		System.out.println(h1);
		System.out.println(h2);
		
		System.out.println(h1.equals(h2));
	}
}
