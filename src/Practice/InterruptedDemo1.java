package Practice;

public class InterruptedDemo1 {

	static void numbers() throws InterruptedException {
		int a[] = {1,2,4,6};
		for(int i=0; i<a.length; i++) {
			Thread.sleep(1000);
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		
		
		try {
			InterruptedDemo1.numbers();
		} catch (InterruptedException e) {
			System.out.println("Handle");
		}
		
	}
}
