package cards;

/**
 * @author komal
 * @since 02/12/2018
 */
public class Card {
	
	private final Suit suit;
	private final int value;
	
	public Card(Suit suit, int value) {
		this.suit = suit;
		this.value = value;
	}

	public Suit getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return "Card [suit=" + suit + ", value=" + value + "]";
	}
}