import java.util.*;

public class Counter<E> {
    /* TODO The HashMap should accomodate a generic class for the keys and Integer for the value*/
    private HashMap<E, Integer> counts;


    /* TODO
        Loop through the elements of "things" and use the HashMap "counts"
        to store the elements of things as keys, and the number of times they
        appear in the array as values. Check the instructions. */
    public Counter(E[] things){
        counts = new HashMap<E, Integer>();
        for (E e : things) {
            counts.merge(e, 1, Integer::sum);
        }
    }

    /* TODO
        This just returns the specific count for an element. It is a wrapper
        for a getting the value of the HashMap given the key "element" */
    public Integer getCount(E element){
        return counts.get(element);
    }

    public int getSize(){
        return this.counts.size();
    }

    /* TODO Returns the most frequent key in the HashMap*/
    public E mostFrequent(){
        return Collections.max(counts.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }
}
