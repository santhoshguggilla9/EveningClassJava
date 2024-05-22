package branchingStatements;

public class NestedIfDemo {

	public static void main(String[] args) {
		
		int a,b,c,big;
		
		a=9;
		b=3;
		c=9;
		
		if(a>b && a>c)
		{
			big=a;
			System.out.println("big= " +big);
		}
		else if(b>a && b>c)
		{
			big=b;
			System.out.println("big= " +big);
		}
		else if(c>a && c>b)
		{
			big=c;
			System.out.println("big= " +big);
		}
		else
		System.out.println("all are equal");
	
	}
}
	
	
