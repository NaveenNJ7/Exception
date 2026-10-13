package Practice;

public class Examples {

	public static void main(String[] args) {
		
		int a=10;
		
		try {
			System.out.println(a/0);
		}catch(ArithmeticException e) {
			System.out.println("Integer should not divide by zero");
		}
		
		
		int i[] = {10,20,30,40};
		
		System.out.println(i[1]);
		
		try {
			System.out.println(i[4]);
		}catch(ArrayIndexOutOfBoundsException b) {
			System.out.println("Index position only upto 3 is exist");
		}
		
		
	}
}
