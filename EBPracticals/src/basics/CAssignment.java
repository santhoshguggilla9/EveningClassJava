package basics;

public class CAssignment {

	public static void main(String[] args) {
		
		int x=10;
		
//		System.out.println("x= " +x); //10
//		System.out.println("x= " +(++x));//(pre-Increment, x+1=x==> 10+1=x, therefore ist is 11)
//		
//		
//		System.out.println("x= " +(x++));//(post-Increment, x=x+1)
//		System.out.println("x= " +x);
//		
		System.out.println((++x)+(" ")+(x)+(" ")+(x++));
		System.out.println((x)+(" ")+(++x)+(" ")+(x++));
		System.out.println("x= " +x);
		
	}
}
