package advanceTopics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataDemo {

	public static void main(String[] args) {

		String path = "C:\\Users\\santh\\git\\repository16\\EBPracticals\\resource\\write.txt";
		String data = "this is the data to write into the file";
		
		// Try-With-Resources
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path)))
		{
			bw.write(data);
			bw.newLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("File(s) Created.");
	}

}
