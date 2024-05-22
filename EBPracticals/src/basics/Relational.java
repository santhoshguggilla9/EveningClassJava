package basics;

public class Relational {

	public static void main(String[] args) {
		
		int age =28;
		boolean res;
		
		res = (age>=27) || (age<=15);
		res = (age>=27) && (age<=15);
		
		res= !(age==28);
		
		System.out.println("result=" +res);
	}
}
