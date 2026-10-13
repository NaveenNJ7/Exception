package Practice;

public class  AgeNotValidForExam extends RuntimeException{

	private String ageMessage;
	
	AgeNotValidForExam(String ageMessage){
		this.ageMessage=ageMessage;
	}

	public String getMessage() {
		return ageMessage;
	}
	
}
