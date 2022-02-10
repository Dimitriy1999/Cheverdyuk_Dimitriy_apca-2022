/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] rankOne = { "3", "5", "7" };
		String[] suitOne = { "Clubs", "Hearts" };
		int[] valueOne = { 3, 5, 7 };
		Deck deckOne = new Deck(rankOne, suitOne, valueOne);
		System.out.println("DeckOne is empty: " + deckOne.isEmpty());
		System.out.println("DeckOne size is: " + deckOne.size());
		System.out.println("DeckOne dealt card is: " + deckOne.deal());
		System.out.println();
		System.out.println(deckOne.toString());
		System.out.println();

		String[] rankTwo = { "Jack"};
		String[] suitTwo = { "Hearts"};
		int[] valueTwo = { 11, 2, 3, 9 };
		Deck deckTwo = new Deck(rankTwo, suitTwo, valueTwo);
		System.out.println("DeckTwo is empty: " + deckTwo.isEmpty());
		System.out.println("DeckTwo size is: " + deckTwo.size());
		System.out.println("DeckTwo dealt card is: " + deckTwo.deal());
		System.out.println();
		System.out.println(deckTwo.toString());
		System.out.println();		
		
		String[] rankFour = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		String[] suitFour = { "Diamonds", "Clubs", "Hearts"};
		int[] valueFour = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		Deck deckFour = new Deck(rankFour, suitFour, valueFour);
		System.out.println("DeckFour dealt card is: " + deckFour.deal());
		System.out.println("DeckFour dealt card is: " + deckFour.deal());
	}
}
