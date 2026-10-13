package Practice;

public class FinallyDemo1 {

	public static void main(String[] args) {
		
		int a=10;
		
		try {
			System.out.println(a/0);
		}
		finally {
			System.out.println("This fianlly will execute");
		}
		
	}
}
