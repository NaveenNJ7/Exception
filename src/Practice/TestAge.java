package Practice;

public class TestAge {

	public static void main(String[] args) {
		
		int age=31;
		
		if(age<=30) {
			
			System.out.println("Eligible for exam");
		}
		else {
			try {
				AgeNotValidForExam a=new AgeNotValidForExam("Age is not more than 30 not valid");
				throw a;
				
			}
			catch(AgeNotValidForExam e) {
				 System.out.println(e.getMessage());
			}
		}
		
	}
}
