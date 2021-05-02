package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService{

	@Override
	public void standartSales(Game game, Gamer gamer) {
		System.out.println("Oyun sat�n al�nd� : " + game.getGameName());
		
	}

	@Override
	public void campaignSales(Game game, Gamer gamer, Campaign campaign) {
		int campaignPrice = game.getGamePrice()-(game.getGamePrice()*campaign.getDiscountRate()/100);
		System.out.println("Kampanya kullan�larak {0} fiyata sat�n al�nd� : " + campaignPrice + campaign.getName());
		
	}

}
