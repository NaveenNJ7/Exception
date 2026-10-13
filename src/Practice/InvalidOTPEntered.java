package Practice;

public class InvalidOTPEntered extends Exception {

	String msg;

	public InvalidOTPEntered(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}
	
}
