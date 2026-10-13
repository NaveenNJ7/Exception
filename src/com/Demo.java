package com;

import java.util.Scanner;

public class Demo {
	
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		
		try
		{
			System.out.println(a+" divided by "+b+" is "+a/b);
		}
		
		// if there is no exception catch block will not get executed
		catch(ArithmeticException e)
		{
			System.out.println("integer cant be divide by 0");
		}
		
		sc.close();
		
		/*
		 1) internally object of ArithmeticException will create
		    ArithmeticException e = new ArithmeticExceptin();
		 2) It will throw object e or new ArithmeticException()
		 3) it will caught by catch block 
		 
		 */
	}

}
