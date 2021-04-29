package kodlama.io;

public class Instructor extends User{
	private String message;

	public Instructor(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
