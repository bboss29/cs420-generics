import java.util.ArrayList;

public class Task {
    public static void main(String[] args){
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:"+hand);
        System.out.println("Cards add:"+addCards(hand));

        /* TODO
        Compete a for loop that prints every card
        in the deck d */
        for (Card c : d){
            System.out.println(c);
        }

    }

    /* TODO  This should compute the sum of values of the cards in an ArrayList of cards.*/
    public static int addCards(ArrayList<Card> hand){
        int out = 0;
        int value = 0;
        String s = "";
        for (Card c : hand) {
            if (c.getValue() instanceof Integer)
                value = (Integer)c.getValue();
            if (c.getValue() instanceof String) {
                s = (String) c.getValue();
                switch (s) {
                    case "Ace":
                        value = 1;
                        break;
                    case "Jack":
                        value = 11;
                        break;
                    case "Queen":
                        value = 12;
                        break;
                    case "King":
                        value = 13;
                        break;
                }
            }
            out += value;
        }
        return out;
    }
}