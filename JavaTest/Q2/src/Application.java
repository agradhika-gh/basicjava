import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		
		//Ask Student to enter the Grade
		System.out.println("Please enter your Grade :");
		Scanner scanner = new Scanner(System.in);
		int grade = scanner.nextInt();
		
		if ((grade >= 1) && (grade < 6)) {
			System.out.println("You are in Elementary School!");
		} else if ((grade >= 6) && (grade < 9)) {
			System.out.println("You are in Middle School!");
		} else if ((grade >= 9) && (grade < 13)) {
			System.out.println("You are in High School!");
		} else if ((grade >= 13) && (grade < 17)) {
			System.out.println("You are in College!");
		} else { 
			//If user enter 0 or any number greater than 16
			System.out.println("You may be done with school and college OR too little to goto School!!");
		}
	}//End of main

}
