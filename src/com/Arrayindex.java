package com;

public class Arrayindex {

	
	public static void main(String[] args) {
		
		int[] a = {10, 20, 30,40};
		
		try {
		System.out.println(a[0]);
		System.out.println(a[3]);
		System.out.println(a[10]);
		}
		
		catch(ArrayIndexOutOfBoundsException A)
		{
			System.out.println("There is no index position of a[10]");
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
