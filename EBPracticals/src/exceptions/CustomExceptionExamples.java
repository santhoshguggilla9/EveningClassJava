package exceptions;

// Custom Exception Class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class CustomExceptionExamples {

	public static void validate(int age) throws CustomException 
	{
        if (age < 18) {
            throw new CustomException("Age less than 18 is not allowed.");
        } else {
            System.out.println("Age is valid.");
        }
}
        
	public static void main(String[] args) 
	{
		 try {
	            validate(15);
	        } catch (CustomException e) {
	            System.out.println("CustomException caught: " + e.getMessage());
	        }
	}

}
