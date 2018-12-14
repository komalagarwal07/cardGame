package player;

import cards.Card;
import game.GameHand;

public interface Player {
	
	void acceptCard(Card card);
	
	Card playCard(GameHand hand);

}
