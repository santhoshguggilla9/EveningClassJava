package arrays;

public class TestBlockDemo {

	public static void main(String[] args) {
		
		String name ="santhosh";
		int x=10;
		
		// Using a text block to define a multi-line string
        String textBlock = """
                {
                    "name": "John Doe",
                    "age": 30,
                    "address": {
                        "street": "123 Main St",
                        "city": "Anytown",
                        "state": "CA",
                        "zipcode": "12345"
            
                        My name is %s and my age is %d
                    }
                }
                """;

        //fill the values of string varaible to the text block
        String finalMail = String.format(textBlock, name, x);
        
        System.out.printf("%s", finalMail);
        System.out.printf("%d", x);
        

	}

}
