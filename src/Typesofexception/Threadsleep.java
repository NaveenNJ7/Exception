package Typesofexception;

public class Threadsleep {

	
	public static void main(String[] args) {
		
	// checked exception, should handle immediately
	for(int i=0; i<=5; i++)
	{
		System.out.println(i);
		
		try 
		{
			Thread.sleep(1000); // Thread is a class and sleep is a method which present in the class
		}
		
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	}
	
}
