package loops;

public class WhileDemo {

	public static void main(String[] args) {
		
		int x;
		
		x=20; //initial value
		
		while(x>=1) //condition
		{
			if(x%2==0)
			System.out.println("x: " +x);
			x--; // updation
		}
	}
}
