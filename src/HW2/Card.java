package HW2;

public class Card{
	
	protected final int RANK;
	protected final Suit SUIT;
	
	public Card(int rank, Suit suit){
			this.RANK = rank;
			this.SUIT = suit;
		if(!(rank < 15 && rank > 1))
			throw new IllegalArgumentException("");
	}

	public int getRank(){
		return RANK;
	}
	
	public char getSuit(){
		String suitString = SUIT.name();
		String lowerSuit = suitString.toLowerCase();
		char littleFirst = lowerSuit.charAt(0);
		return littleFirst;
	}
	
	public String toString(){
		return (getRank() + " of " + getSuit());
	}
}
