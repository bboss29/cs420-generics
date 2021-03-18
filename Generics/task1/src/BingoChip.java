public class BingoChip<T,E> {
    T letter;
    E number;

    public BingoChip(T t, E e){
        letter = t;
        number = e;
    }

    @Override
    public String toString(){
        return "Chip:"+letter+"-"+number;
    }
}
