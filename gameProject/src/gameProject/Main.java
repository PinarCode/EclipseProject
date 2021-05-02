package gameProject;

import Concrete.GamerManager;
import Concrete.UserValidationManager;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new UserValidationManager());
		gamerManager.add(new Gamer(1,"Pýnar","Kaya",1996,"12345678925"));

	}

}
