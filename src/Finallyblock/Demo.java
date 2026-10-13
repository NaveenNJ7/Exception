package Finallyblock;

public class Demo {

	
	public static void main(String[] args) {
		
		int a = 10;
		
		try
		{
			System.out.println(10/0);
		}
		
		catch(Exception e)
		{
			System.out.println("we got exception but still finally block  will get execute");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("Finally block executed");
		}
		
		System.out.println("End");
		
	}
	
	
}
