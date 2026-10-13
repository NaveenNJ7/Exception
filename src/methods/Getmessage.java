package methods;

public class Getmessage {

	
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		int a = 10;
		
		try
		{
			System.out.println(10/0);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage()); // which gives small message about exception
			
			System.out.println("Or");
			
			String message = e.getMessage();
			System.out.println(message);
		}
		
		System.out.println("End");
	}
	
	
	
}
