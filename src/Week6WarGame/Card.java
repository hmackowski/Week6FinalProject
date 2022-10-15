package Week6WarGame;
public class Card {

	private int cardName;	//Integer to get the name of the card
	private int cardValue;  //Integer to get the value of the card

	
/**
 * Calling this method will create a card when given a cardName value and a cardValue
 * @param Int cardName
 * @param Int cardValue
 */
	public Card(int cardName, int cardValue) {
		this.setCardName(cardName);
		this.setCardValue(cardValue);	
	}	
	
	/**
	 * Sets the int cardName and ensures the value can only be between 0, and 3, for the 4 suits in a deck.
	 * @param int cName 
	 */
	private void setCardName(int cName) {
		if (cName >= 0 && cName <= 3) {
			this.cardName = cName;
		} else {
			throw new IndexOutOfBoundsException("Number needs to be between 0 and 3!");
			
		}
	}
	
	/**
	 * Sets the int cardValue and ensures card value is between 2 and 14
	 * @param int cValue 
	 */
	//Ensures card value is between 2 and 14
	private void setCardValue(int cValue) {	
		if (cValue < 2 || cValue > 14) {
			throw new IndexOutOfBoundsException("!The card value needs to be between 2 and 14!");
		}
		this.cardValue = cValue;
	}
	
	
	//gets cardName
	public int getcardName() {
		return cardName;
	}
	
	//gets cardValue
	public int getcardValue() {
		return cardValue;
	}
	
	
	/**
	 * Builds a string to display or describe the Card as a String.
	 * @return StringBuilder cardBuilder.ToString()
	 */
	public String describe() {
		
		StringBuilder cardBuilder = new StringBuilder(); //Creating a StringBuilder to concatenate the name of the card we are building
		
		switch(cardValue) {
		
		//Assigns a String according to the value of the card
		case 2:
			cardBuilder.append("Two of ");
			break;
		case 3:
			cardBuilder.append("Three of ");
			break;
		case 4:
			cardBuilder.append("Four of ");
			break;
		case 5:
			cardBuilder.append("Five of ");
			break;
		case 6:
			cardBuilder.append("Six of ");
			break;
		case 7:
			cardBuilder.append("Seven of ");
			break;
		case 8:
			cardBuilder.append("Eight of ");
			break;
		case 9:
			cardBuilder.append("Nine of ");
			break;
		case 10:
			cardBuilder.append("Ten of ");
			break;
		case 11:
			cardBuilder.append("Jack of ");
			break;
		case 12:
			cardBuilder.append("Queen of ");
			break;
		case 13:
			cardBuilder.append("King of ");
			break;
		 default: //Ace by default of course
			cardBuilder.append("Ace of ");
			break;

		}
		
			//Assigns the suit according to the cardName integer value
		switch(cardName) {
		
		case 0:
			cardBuilder.append("Spades");
			break;
		case 1:
			cardBuilder.append("Clubs");
			break;
		case 2:
			cardBuilder.append("Hearts");
			break;
		case 3:
			cardBuilder.append("Diamonds");
			break;
			
		}
		
		return cardBuilder.toString(); //Returns the concatenated string containing the value of the card and suit
	}
}



























