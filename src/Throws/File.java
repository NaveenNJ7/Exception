package Throws;

import java.io.FileReader;

public class File {

	void reader() throws Exception
	{
        FileReader f = new FileReader("Demo.text");
	}
	
	public static void main(String[] args) {
		
		File F = new File();
		
		try
		{
			F.reader();
		}
		
		catch(Exception e)
		{
			System.out.println("File cant found");
		}
	}
	
	
	
	
}
