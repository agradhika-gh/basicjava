import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a Age:");
		int age = userInput.nextInt();
		
		Student student1 = new Student();
		
		try {
		
			student1.getPermit(age);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}//Main method
	
}//End of Application