package loops;

public class ReverseDemo {

	public static void main(String[] args) {

		int n,r,rev=0;
		
		n=154; // 1+5+4 =10
		
		while(n>0)
		{
			r=n%10;        
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("sum of digits: " +rev);
	}
}
