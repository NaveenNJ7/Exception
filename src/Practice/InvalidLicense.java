package Practice;

public class InvalidLicense extends Exception {

	public static void main(String[] args) {
		
		int n=20;

		if(n>=21) {
			System.out.println("Valid license");
		}
		else {
			try {
				InvalidLicense i = new InvalidLicense();
				throw i;
			}
			catch(InvalidLicense e) {
				System.out.println("Invalid licnse");
			}
		}
	}
}
