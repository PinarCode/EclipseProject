package kodlama.io;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Pınar", "Kaya", "pinar@pinar.com","12345");
		Student student = new Student("Java+React");
		student.getCourseName();
		Instructor instructor = new Instructor("Ödevler Yapılsın!");
		instructor.getMessage();
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(user);
		studentManager.addCourse(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addMessage(instructor);
		

	}

}
