package branchingStatements;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int statusCode = 8;
		
		
		switch(statusCode)
		{
			
				case 1:
					System.out.println("Status code = " + statusCode);
					break;
			
				case 2:
					System.out.println("Status code = " + statusCode);
					break;
					
				case 3:
					System.out.println("Status code = " + statusCode);
					break;
					
				case 4:
					System.out.println("Status code = " + statusCode);
					break;
					
				case 5:
					System.out.println("Status code = " + statusCode);
					break;
					
				default:
					System.out.println("Invalid status Code");
		}
		
		char ch='A';
		
		switch(ch)
		{
			
				case 'a', 'A':
					System.out.println("it is vowel");
					break;
								
				case 'e','E':
					System.out.println("it is vowel");
					break;
					
				case 'i','I':
					System.out.println("it is vowel");
					break;
					
				case 'o','O':
					System.out.println("it is vowel");
					break;
					
				case 'u','U':
					System.out.println("it is vowel");
					break;
					
				default:
					System.out.println("Invalid Character");
		}
	}
}
