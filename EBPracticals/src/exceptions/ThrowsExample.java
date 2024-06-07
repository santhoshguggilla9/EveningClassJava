package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

	// Method that may throw IOException
    public static void readFile(String fileName) throws IOException 
    {
        FileReader file = new FileReader(fileName);
        BufferedReader fileInput = new BufferedReader(file);

        // Print the first line of the file
        System.out.println(fileInput.readLine());
        fileInput.close();
    }
	public static void main(String[] args) {
		
		try {
	            readFile("test.txt");
	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	}

}
