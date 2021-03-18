public class Card <V,S>{
    private V value;
    private S suit;
/* TODO
Implement the constructor, getters and setters and toString */
    public Card(V v, S s){
        value = v;
        suit = s;
    }

    public S getSuit() {
        return suit;
    }
    public void setSuit(S suit) {
        this.suit = suit;
    }

    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
