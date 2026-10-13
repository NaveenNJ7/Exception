package Customexception;

import java.util.Scanner;

public class Testage {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age");
		int age = sc.nextInt();
		
		if(age>=21)
		{
			System.out.println("Eligible to get driving licence");
		}
		else
		{
			try {
			AgeValidationException a = new AgeValidationException("Not Eligible");
			throw a;
			}
			
			catch(Exception e)
			{
				System.out.println(e.getMessage()); 
			}
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
}
