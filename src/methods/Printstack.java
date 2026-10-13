package methods;

public class Printstack {

	
	public static void main(String[] args) {
		
		
		
		int a = 10;
		
		System.out.println("Start");
		try
		{
			System.out.println(a/0);
		}
		
		catch(Exception e)
		{
			e.printStackTrace(); // which complete information about the exception
		}
		
		System.out.println("End");
		
		
		
		
		
		
	}
	
}
