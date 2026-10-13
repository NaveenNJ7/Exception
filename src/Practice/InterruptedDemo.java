package Practice;

public class InterruptedDemo {

	public static void main(String[] args) {
		
		int a[] = {10,20,30};
		
		for(int i:a) {
			try {
				System.out.println(i);
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("Handle");
			}
		}
	}
}
