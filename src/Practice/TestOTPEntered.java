package Practice;

public class TestOTPEntered {

	public static void main(String[] args) {
		
		int otp=1234;
		
		if(otp==123) {
			System.out.println("OTP entered valid");
		}
		else {
			try {
			throw new InvalidOTPEntered("Invalid OTP Entered");
			}
			catch(InvalidOTPEntered i) {
				System.out.println(i.getMessage());
			}
		}
	}
}
