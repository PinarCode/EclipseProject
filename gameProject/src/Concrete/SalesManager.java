package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService{

	@Override
	public void standartSales(Game game, Gamer gamer) {
		System.out.println("Oyun satýn alýndý : " + game.getGameName());
		
	}

	@Override
	public void campaignSales(Game game, Gamer gamer, Campaign campaign) {
		int campaignPrice = game.getGamePrice()-(game.getGamePrice()*campaign.getDiscountRate()/100);
		System.out.println("Kampanya kullanýlarak {0} fiyata satýn alýndý : " + campaignPrice + campaign.getName());
		
	}

}
