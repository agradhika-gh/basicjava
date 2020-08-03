public class Application {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.age = 10;
		student1.name = "Radhika";
		student1.readBook();
		student1.readABook("Mahabharatam!!");
		
		
		Teacher teacher1 = new Teacher();
		teacher1.teacherName = "Sai Ram - Java Teacher";
		teacher1.teach();
		teacher1.teachASubject("Java Basic!!");
		
		
	}
}