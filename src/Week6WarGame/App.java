package Week6WarGame;

public class App {

	public static void main(String[] args) {
		//2a 	Instantiate a Deck and two Players
		Deck warDeck = new Deck();
		Player player1 = new Player("Tom");
		Player player2 = new Player("Jerry");
				
		warDeck.shuffle(); //Shuffles the deck
		
				
		for (int i = 0; i < 52; i++) { //Gives each players a card, if even, player 1 gets card, else player 2 gets card
			if (i %2 == 0) {           // goes through loop 52 times until all cards are handed out.
				player1.draw(warDeck);
			} else {
				player2.draw(warDeck);
			}
		}
		
		
		player1.describe(); // displays player1's cards
		player2.describe();// displays player2's cards
		
		for (int j = 0; j < 26; j++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
						
			//Compares player 1 and 2's cards to see who had a greater value, then increments their score.
			if (player1Card.getcardValue() > player2Card.getcardValue()) {
				player1.incrementScore();
			} else if (player1Card.getcardValue() < player2Card.getcardValue()) {
				player2.incrementScore();
			}			
		}
		
		// Displays both players final score
		System.out.println("\n*****************************\n " + player1.getName() + " has " + player1.getScore() + " points!\n");
		System.out.println("*****************************\n " + player2.getName() + " has " + player2.getScore() + " points!");
		
	        //Displays the winner, unless it is a draw, then it displays Draw
	        if (player1.getScore() > player2.getScore()) {
	            System.out.println("\n↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓\n"+ player1.getName() +" is the winner!\n↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
	        } else if (player1.getScore() < player2.getScore()) {
	            System.out.println("\n↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓\n "+ player2.getName() +" is the winner!\n↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
	        } else {
	            System.out.println("\n##############################\n There is a draw between " + player1.getName() + " and " + player2.getName() + "!");
	        }
	       
	}
}
