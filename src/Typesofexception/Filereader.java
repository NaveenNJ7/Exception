package Typesofexception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filereader {

	
	public static void main(String[] args) {
		
		// FileReader is predefined class present in java.io package
		/*
		 when we create an object of FileReader or when we try to read data from file, here 
		 the compiler already knows that possibility of file not found exception
		 therefore programmer has to handle it immediately
		 
		 when we try to read a file, that file should be exist otherwise how can we read it
		 so the compiler knows that certain time file may not find, so it will tell us exception
		 */
		try 
		{
			FileReader r = new FileReader("demo.text");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found");
		}
		
		
	}
}
