package commerceSignUp.business.concretes;

import commerceSignUp.business.abstracts.UserService;
import commerceSignUp.business.abstracts.UserValidationService;
import commerceSignUp.core.VerificationService;
import commerceSignUp.entities.concretes.User;

public class VerificationManager implements VerificationService{

	UserService userService;
	UserValidationService userValidationService;
	
	public VerificationManager(UserService userService, UserValidationService userValidationService) {
		super();
		this.userService = userService;
		this.userValidationService = userValidationService;
	}

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		
		User user = new User(id,firstName,lastName,email,password);
		if(!userValidationService.validate(user)) {
			System.out.println("Kay�t ba�ar�s�z. Alanlar� kontrol ediniz.");
			return;
		}
		System.out.println("Kay�t i�lemi ba�ar�l�. ");
	}

	@Override
	public void login(String email, String password) {
		
		System.out.println("Giri� ba�ar�l�. ");
	}

}
