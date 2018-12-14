package cards;

import java.util.List;

/**
 * This file consists of a list of 52 cards for our game
 * @author komal
 *
 */

public class Deck {
	
	private final List<Card> deck;

	public Deck(List<Card> deck) {
		super();
		this.deck = deck;
	}

	public List<Card> getDeck() {
		return deck;
	}

	@Override
	public String toString() {
		return "Deck [deck=" + deck + "]";
	}
}
