import java.util.ArrayList;

public class Student {
	String firstName;
	String lastName;
	int age;
	int grade;
	boolean passFail;
	
	private ArrayList<Subjects> subjects;
	
	//Constructor
	Student(String firstName, String lastName, int age, int grade){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.grade = grade;
		
	}
	
	private void assignSubject() {
		
		Subjects subject1 = new Subjects("Science");
		Subjects subject2 = new Subjects("Social");
		Subjects subject3 = new Subjects("Math");
		Subjects subject4 = new Subjects("Literature");
		
		//Add all the subjects to the ArrayList
		subjects = new  ArrayList<Subjects>();
		subjects.add(subject1);
		subjects.add(subject2);
		subjects.add(subject3);
		subjects.add(subject4);	
		
		
	}
	
	public void addSubjects(){
		
		this.assignSubject();
		
	}
	
	
	
	public void displaySubjects(){
		
		for(Subjects subject: subjects) {
			System.out.println("Student's subject name: " + subject.subjectName);
		}
		
	}
	
	public boolean getGrade(int GPA) {

		if (GPA < 3) {
			passFail = false;
			return passFail;
		} else {
			passFail = true;
			return passFail;
		}
	}
	
	
	public void displayStudentData() {
		
		System.out.println("Student: "+firstName +" "+lastName+" Age is: "+ age+ " Grade is: "+grade);
		
	}

}
