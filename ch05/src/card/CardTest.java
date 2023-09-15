package card;

public class CardTest {

	public static void main(String[] args) {

		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();
		
		System.out.println("카드번호 : " + card1.getcardNumber());
		System.out.println("카드번호 : " + card2.getcardNumber());
		System.out.println("카드번호 : " + card3.getcardNumber());
		
	}

}
