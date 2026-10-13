package Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileDemo {

	public static void main(String[] args) {
		
		try {
			FileReader file=new FileReader("Demo.text");
		}catch(FileNotFoundException f) {
			System.out.println("File not available");
		}
		
		
	}
}
