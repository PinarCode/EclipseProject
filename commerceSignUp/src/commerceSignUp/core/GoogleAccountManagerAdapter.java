package commerceSignUp.core;

import commerceSignUp.googleAccount.GoogleAccountManager;

public class GoogleAccountManagerAdapter implements VerificationService{

	@Override
	public void register(int id,String firstName,String lastName,String email, String password) {
		GoogleAccountManager manager = new GoogleAccountManager();
		manager.register(id,firstName,lastName,email, password);
		
	}

	@Override
	public void login(String email, String password) {
		GoogleAccountManager manager = new GoogleAccountManager();
		manager.login(email, password);
		
	}

}
