public class Card
{
    private int card1;
    private int card2;
    /**
     * Constructor
     * @param Card: States that the cards are actually shuffled
     */
    public Card() {
        System.out.println("Cards has been shuffled.");
    }
    /**
     * getCard method: This method returns the first and next card drawn
     * @return card: returns the card as an integer
     */
    public int getCard(int cardNumber) {
        int lowest = 1;
        int highest = 20;

        int card = (int)Math.floor(Math.random()*(highest-lowest+1)+lowest);

        if (cardNumber == 1) {
            card1 = card;
        } else {
            card2 = card;
        }
        return card;
    }
    /**
     * judgement method: This method returns the second card's result for
     * if it's higher, lower or the same number as the first card
     * @return result: returns the card as a String
     */
    public String judgement() {
        String result = new String("blank");
        if (card2 > card1) {
            result = "higher";
        } else if (card2 < card1) {
            result = "lower";
        } else {
            result = "tie";
            System.out.print(".");
        }
        return result;
    }

}