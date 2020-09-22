import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
				
		Student student1 = new Student("Ritwika","Petluri",21,12);
		Student student2 = new Student("Tom","Jerry",21,12);
		Student student3 = new Student("Donald","Trump",70,1);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		
		student1.addSubjects();
		student1.getGrade(4);
		
		student2.addSubjects();
		student2.getGrade(3);
		
		student3.addSubjects();
		student3.getGrade(2);
		
		int GPA = 4;
		//Display data for all the Students
		for(Student student: students) {
			
			//Display Student personal details
			student.displayStudentData();
			
			//Display subject chosen by the student
			student.displaySubjects();
			
			//Display results for the student based on GPA
			boolean passFail = student.getGrade(GPA);
			if (passFail)
				System.out.println("This student Passed class!!");
			else 
				System.out.println("Sorry! This student Failed class.");
			GPA = GPA - 1;
		}
	}

}
