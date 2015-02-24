/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card ace = new Card("Ace", "Clubs", 1);
		Card king = new Card("King", "Clubs", 13);
		Card ace2 = new Card("Ace", "Clubs", 1);
		System.out.println(ace.matches(king));
		System.out.println(ace.toString() +" " + ace2.toString());
		System.out.println(ace.matches(ace2));
	}
}
