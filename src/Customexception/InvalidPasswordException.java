package Customexception;

import java.util.Scanner;

public class InvalidPasswordException extends RuntimeException {
	
 	/* custom Class is InvalidPasswordException and inheriting RuntimeException class
	 because i want make InvalidPasswordException as unchecked exception 
	 If we want to make it as checked exception it should inherit the Exception
	 */
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id");
		String id = sc.next();
		
		System.out.println("Enter the password");
		int Password = sc.nextInt();
		
	/*	String id = "Navin";
		int Password = 8867; */
		
		if(id.equals("Navin"))
		{
			if(Password==8867)
			{
				System.out.println("Login successful");
			}
			else
			{
				try{
				InvalidPasswordException i = new InvalidPasswordException();
				throw i;  // throw new InvalidPasswordException();
				}
				catch(InvalidPasswordException e)
				{
				  System.out.println("Invalid password");	
				}
			}
		}
		
	}
	
	
	
	
	

}
