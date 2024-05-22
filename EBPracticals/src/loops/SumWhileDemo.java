package loops;

public class SumWhileDemo {

	public static void main(String[] args) {
		
		int n,r,sum=0;
		
		n=154; // 1+5+4 =10
		
		while(n>0)
		{
			r=n%10;        
			sum=sum+r;
			n=n/10;
		}
		System.out.println("sum of digits: " +sum);
	}

}
