package commerceSignUp.business.concretes;

import commerceSignUp.business.abstracts.UserValidationService;
import commerceSignUp.core.ValidationRules;
import commerceSignUp.entities.concretes.User;
import java.util.regex.Pattern;


public class UserValidationManager implements UserValidationService{

	private static final Pattern EMAIL_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(.[A-Z]{2})$");
	
	@Override
	public boolean validate(User user) {
		boolean result = ValidationRules.run(passwordControl(user.getPassword()),emailControl(user.getEmail()),
				firstNameControl(user.getFirstName()),lastNameControl(user.getLastName()));
		return result;
	}

	private boolean passwordControl(String password) {
		return password.length() >= 6;
	}
	
	private boolean emailControl(String email) {
		return EMAIL_REGEX.matcher(email).find();
	}
	
	private boolean firstNameControl(String firstName) {
		return firstName.length() >= 2;
	}
	
	private boolean lastNameControl(String lastName) {
		return lastName.length() >= 2;
	}
}
