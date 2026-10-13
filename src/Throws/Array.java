package Throws;

public class Array {

	
	static void m() throws Exception
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	
	public static void main(String[] args) {
		
		try 
		{
			m(); // Array.m(); static in same class
		} 
		catch (Exception e) 
		{
			System.out.println("Handle");
		}
		
		
	}
	
	
}
