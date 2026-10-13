package Throws;

public class Unchecked {

	
	static void m() throws ArithmeticException // even if we dont  use this throws its fine bcoz it is 
	                                           // unchecked exception 
	{                                       //   most of the times throws use with checked exception
		System.out.println(10/0);
	}
	
	public static void main(String[] args) {
		
		// method is static so we can call it directly in the same class or
		// if it call it another class that time we should use classname.methodname();
		
		try {
		Unchecked.m(); // m();
		}
		
		catch(Exception e)
		{
			System.out.println("Not divided by 0");
		}
		
		/*
		 here exception is occurred in method, but method does not handle the exception it will throws 
		 the exception and tell caller m() to handle the exception so m() method should sorround 
		 with the try and catch block
		 
		 n
		 
		 
		 
		 
		 */
		
		
		
	}
	
	
}
