package Finallyblock;

public class Example {

	
	public static void main(String[] args) {
		
		int a=10;
		
		try
		{
			System.out.println(a/0);
		}
		
		catch(ClassCastException e) // we gave wrong exception (class cast exception)
		{
			System.out.println("Invalid");
		}
		
		/*
		 Here we have written wrong exception that is class cast exception so exception will occur but
		 finally block will execute all time, and End will not print.
		 */
		
		finally
		{
			System.out.println("final block Execute all the time");
		}
		
		System.out.println("End");
		
		
		
	}
	
	
	
}
