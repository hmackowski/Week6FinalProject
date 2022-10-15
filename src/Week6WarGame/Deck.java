package Week6WarGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	
	List<Card> cards = new ArrayList<Card>(); 
	
	/**
	 * Builds a deck with the proper amount of cards including face value and suits.
	 */
	public Deck() { // builds a deck with the proper amount of cards including face value and suits
		for (int assignSuit = 0; assignSuit < 4; assignSuit++) {
			for (int assignValue = 2; assignValue <= 14; assignValue++) {
				cards.add(new Card(assignSuit, assignValue));
			}
		}
	}
	
	/**
	 * Shuffles the elements of the ArrayList cards.
	 * Basically, it shuffles the Deck.
	 */
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	/**
	 * Draws a card from the top of the deck, and removes it from the array list.
	 * @return The card that is being removed.
	 */
	public Card draw() {  
		return cards.remove(0);
	}
}
