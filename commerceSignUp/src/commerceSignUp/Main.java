package commerceSignUp;

import commerceSignUp.business.abstracts.UserService;
import commerceSignUp.business.concretes.UserManager;
import commerceSignUp.business.concretes.UserValidationManager;
import commerceSignUp.business.concretes.VerificationManager;
import commerceSignUp.dataAccess.concretes.HibernateUserDao;
import commerceSignUp.entities.concretes.User;
import commerceSignUp.core.VerificationService;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"Pýnar","Kaya","pinar@pinar.com","123456");
		
		UserService userService = new UserManager(new HibernateUserDao());
		userService.add(user);
		
		VerificationService verification = new VerificationManager(userService, new UserValidationManager());
		verification.login("pinar@pinar.com", "123456");
		verification.register(1,"Pýnar","Kaya","pinar@pinar.com","123456");

	}

}
