package advanceTopics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadDataFileDemo {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\santh\\git\\repository16\\EBPracticals\\resource\\sample.txt";
		
		// Try-With-Resources
		try(BufferedReader br = new BufferedReader(new FileReader(path)))
		{
			String line;
			while((line=br.readLine())!=null)
			System.out.println(line);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
