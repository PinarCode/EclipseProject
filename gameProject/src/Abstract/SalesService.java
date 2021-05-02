package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SalesService {
	void standartSales(Game game, Gamer gamer);
	void campaignSales(Game game, Gamer gamer, Campaign campaign);
}
