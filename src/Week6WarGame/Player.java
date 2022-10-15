package Week6WarGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	
	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name;
	
	
//	public Player() {
//		score = 0;
//	}
	
	 public Player(String newName) {
	        name = newName;
	        score = 0;
	    }

	

	 // Prints out Players name and score
	public void describe() {
		System.out.println("--------------------\n  " + name + " \n--------------------" );
//		System.out.println("\n " + name + " " + "has " + score + " points!");
		
		for(Card card : hand) {
			System.out.println(card.describe());
		}
		
	}
	
	/** Returns the first card(int cardName, int cardValue) in the hand ArrayList and then removes it.

	 */
	public Card  flip(){ 
		return hand.remove(0);
	}
		
	
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }
	
    // Increments the score integer
	public void incrementScore() {
		score++;
		
	}

	//Returns the current Score
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
	
}

