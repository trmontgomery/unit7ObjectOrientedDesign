/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"Ace", "Two", "King"};
		String[] suits = {"Clubs", "Heart", "Diamonds"};
		int[] points = {1,2,13};
	    Deck a = new Deck(ranks, suits, points);
	    System.out.println(a.isEmpty());
	    System.out.println(a.size());
	    System.out.println(a.deal());
	    
	    String[] ranks2 = {};
		String[] suits2 = {};
		int[] points2 = {};
	    Deck b = new Deck(ranks2, suits2, points2);
	    System.out.println(b.isEmpty());
	    System.out.println(b.size());
	    System.out.println(b.deal());
	}
}
