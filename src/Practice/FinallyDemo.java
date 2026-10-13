package Practice;

public class FinallyDemo {

	
	public static void main(String[] args) {
		
		int a=10;
		
		try {
			System.out.println(a/0);
		}
		catch(Exception e) {
			System.out.println("should not divide by 0");
		}
		
		finally 
		{
			System.out.println("It will always execute");
		}
		
	}
}
