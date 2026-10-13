package Customexception;

public class AgeValidationException extends RuntimeException{

	
	private String message;
	
	AgeValidationException(String message)
	{
		this.message = message;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	
}
