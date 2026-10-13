package Practice;

public class InvalidOTP extends RuntimeException{

	public static void main(String[] args) {
		
		int otp=1234;
		
		if(otp==123) {
			System.out.println("Valid OTP");
		}
		else {
			throw new InvalidOTP();
		}
		
	}
}
