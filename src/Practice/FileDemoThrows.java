package Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileDemoThrows {

	static void filedemo() throws FileNotFoundException{
		FileReader file=new FileReader("Demo.txt");
	}
	
	public static void main(String[] args) {
		
		try {
			filedemo();
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found");
			e.printStackTrace();
			String msg=e.getMessage();
			System.out.println(msg);
		}
		
	}
}
