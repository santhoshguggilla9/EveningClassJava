package loops;

public class NestedFor {

	public static void main(String[] args) {
		
		int x,y;
		
		for(x=5;x>=1;x--)
		{
			for(y=1;y<=x;y++)
			{
				System.out.print(y);
			}
			System.out.print("\n");
		}
		
	}

}
