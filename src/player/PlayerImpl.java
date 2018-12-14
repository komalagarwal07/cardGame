package player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import cards.Card;
import cards.Suit;
import game.GameHand;

public class PlayerImpl implements Player {
	
	private final String id;
	private final Map<Suit, TreeSet<Card>> cards;
	
	public PlayerImpl(String id) {
		this.id = id;
		this.cards = new HashMap<Suit, TreeSet<Card>>(Suit.values().length);
	}
	
	public void acceptCard(Card card) {
		if (cards.containsKey(card.getSuit())) {
			//cards.put(card.getSuit(), )
		}
		
	}

	public Card playCard(GameHand hand, Suit trump) {
		
		
	}

	public String getId() {
		return id;
	}

	public List<Card> getCards() {
		return cards;
	}

	@Override
	public String toString() {
		return "PlayerImpl [id=" + id + ", cards=" + cards + "]";
	}
	
}
