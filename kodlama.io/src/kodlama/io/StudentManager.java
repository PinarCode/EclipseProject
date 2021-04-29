package kodlama.io;

public class StudentManager extends UserManager{
	public void addCourse(Student student) {
			System.out.println(student.getCourseName() + " kursu eklendi");
	}
}
