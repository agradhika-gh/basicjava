
public class Student {
	
	boolean getPermit(int age) throws Exception {
		
		if (age < 13) {
			
			//Not eligible for permit
			throw new Exception("Exception was raised as expected - Not eligible for permit.");
		} 
		else {
			System.out.println("You are eligible to get a permit!");
		}
		
		return false;

	} //getPermit
	
}//Student
