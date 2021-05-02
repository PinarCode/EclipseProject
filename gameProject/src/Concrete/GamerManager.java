package Concrete;

import Abstract.GamerService;
import Abstract.UserValidationService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	UserValidationService userValidationService;
	
	public GamerManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if(userValidationService.validate(gamer)==true) {
			System.out.println("Oyuncu eklendi.");
		}else {
			System.out.println("Kayýt baþarýsýz.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi.");
		
	}

}
