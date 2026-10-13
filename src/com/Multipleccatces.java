package com;

import java.util.Scanner;

public class Multipleccatces {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter value of a");
		int a = s.nextInt();
		
		System.out.println("Enter value of b");
		int b = s.nextInt();
		
		try
		{
			System.out.println(a+" divided by "+b+" is "+a/b);
		}
		
		// One try block can have multiple catch blocks
		
		// int b; ( there should not be executable lines of code between try and catch block )
				
		catch(ArrayIndexOutOfBoundsException I)
		{
			System.out.println("There is no integer array");
		}
		
		catch(ArithmeticException A)
		{
			System.out.println("Cant divide by 0");
		} 
		
		catch(NullPointerException N)
		{
			System.out.println("No null pointer");
		}
		
		catch(Exception E)
		{
			System.out.println("It is always good practice to write super class exception at last");
		}

		/* we can write specific exception type after the super class exception but it will consider first
		   Super class exception handler, if we write any exception type handler after super class exception
		   it will give error.
		   because reaching that specific exception type, it will caught by superclass exception
		   so it will give error.. so it is better to write super class exception at last
		   
		   it is like upcasting, because they are inheriting Exception class or subclasses of Exception class
		*/
	}
	
	
	
	

}
