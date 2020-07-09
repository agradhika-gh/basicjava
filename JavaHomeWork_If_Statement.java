import java.util.Scanner;

public class JavaHomeWork_If_Statement {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a month number:");
		int month = userInput.nextInt();
		int year ;
		
		boolean leapYear;
		
		if (month > 12) {
			System.out.println("Invalid Month");
		} else {	
			System.out.println("Enter a Year:");	
		}
		
		year = userInput.nextInt();
		int reminder = (year % 4);
		if (reminder == 0)
			leapYear = true;
		else leapYear = false;
		
		
		if (month == 1) {
			System.out.println("January");
			System.out.println("has 31 days.");
		}
		else if ((month ==2) && (leapYear)) {
			System.out.println("February");
			System.out.println("Leap year - February has 29 days.");
			}
		else if ((month ==2) && (!leapYear)) {
			System.out.println("February");
			System.out.println("Not Leap year - February has 28 days.");
			}
		else if (month ==3) {
			System.out.println("March");
			System.out.println("has 31 days.");
		}
		else if (month ==4) {
			System.out.println("April");
			System.out.println("has 30 days.");
		}
		else if (month ==5) {
			System.out.println("May");
			System.out.println("has 31 days.");
		}
		else if (month ==6) {
			System.out.println("June");
			System.out.println("has 30 days.");
		}
		else if (month ==7) {
			System.out.println("July");
			System.out.println("has 31 days.");
		}
		else if (month ==8) {
			System.out.println("August");
			System.out.println("has 31 days.");
		}
		else if (month ==9) {
			System.out.println("September");
			System.out.println("has 30 days.");
		}
		else if (month ==10) {
			System.out.println("October");
			System.out.println("has 31 days.");
		}
		else if (month ==11) {
			System.out.println("November");
			System.out.println("has 30 days.");
		}
		else if (month ==12) {
			System.out.println("December");
			System.out.println("has 31 days.");
		}
	}

}