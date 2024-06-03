package branchingStatements;

public class NewSwitchDemo {

	public static void main(String[] args) {
		
		String dayName;
		int x = 2;
		

				
				int result=switch(x)
						{
						
						case 1 -> 1;
						case 2 -> {
									int sum;
									sum=x+x;
									yield sum;
									}
						default -> 0;
						
				};
				System.out.println("The result: " +result);			
	}
}
