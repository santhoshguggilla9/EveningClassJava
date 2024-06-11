package lambdaDemo;

@FunctionalInterface
interface sum
{
	public int add(int a, int b);
}

// -> lambda operator
public class LambdaExample {

	public static void main(String[] args) {
		
		sum sobj = (int a, int b) -> a+b;

		System.out.println(sobj.add(10, 20));
	}
}
