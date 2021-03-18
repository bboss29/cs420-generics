import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Deck implements Iterable<Card> {
    private List<Card> deck;
    private String[] suits = {"Hearts","Clubs","Diamonds","Spades"};
    private String[] valueStrings = {"Ace", "Jack", "Queen","King"};
    private int[] valueInts = {2, 3, 4, 5, 6, 7, 8, 9, 10};
    public Deck() {
        /* TODO
            This constructor initializes the deck variable with
            all the cards of a deck, except a joker.
            The suits array may help you.*/
        deck = new LinkedList<Card>();
        for (String suit : suits) {
            for (String value : valueStrings) {
                deck.add(new Card(value, suit));
            }
            for (int value : valueInts) {
                deck.add(new Card(value, suit));
            }
        }
    }
    /* TODO
            Code this. It is almost EXACTLY as the  method to draw one object
            from the bag in the previous task. The difference is that this method
            REMOVES the card from the deck */
    public Card dealCard(){
        return deck.remove((int)(Math.random()*deck.size()));
    }

    /* TODO: Return the size of the deck (number of cards left in it)*/
    public int size(){
        return deck.size();
    }

    /* TODO Return a new DeckIterator with this instance in the constructor.*/
    @Override
    public Iterator<Card> iterator() {
        return new DeckIterator<Card>(this);
    }
}
