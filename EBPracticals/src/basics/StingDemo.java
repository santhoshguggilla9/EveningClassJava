package basics;

public class StingDemo {

	public static void main(String[] args) {
	
		String str1="Hello   world";
		String str2="world";
		
		if(str1.compareTo(str2)==0)
		System.out.println("equal");
		else
		System.out.println("not equal");
		
		System.out.println(str2.toUpperCase());
		System.out.println(str1.trim());
		
	}
}
