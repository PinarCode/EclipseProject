package Concrete;

import Abstract.UserValidationService;
import Entities.Gamer;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean validate(Gamer gamer) {
		if(gamer.getFirstName()=="Pýnar" && gamer.getLastName()=="Kaya" && 
				gamer.getBirthYear()==1996 && gamer.getIdentityNumber()=="12345678925") {
			return true;
		}else {
			return false;
		}
	}

}
