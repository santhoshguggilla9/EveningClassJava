package loops;

public class FactDemo {

	public static void main(String[] args) {
		// Factorial of n
		
		int n =5; // 5*4*3*2*1 = 120
		
		int x=1;
		int fact=1;
		
		do
		{
			fact=fact*x; 
			x++;
			
		}while(x<=n);
		
		System.out.println("Factorial of n: " + fact);
	}

}
