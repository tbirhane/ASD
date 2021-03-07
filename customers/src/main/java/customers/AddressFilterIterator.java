package customers;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class AddressFilterIterator<T> implements Iterator<T> {

    private List<T> list;
    private Predicate<T> predicate;
    private int position;
    public AddressFilterIterator(List<T> list, Predicate<T> predicate){
        this.list = list;
        this.predicate = predicate;
        this.position = 0;
    }
    @Override
    public boolean hasNext() {
        int tmpPosition = position;
        while(tmpPosition < list.size()){
            T element = list.get(tmpPosition);
            if (predicate.test(element)) return true;
            else tmpPosition++;
        }
        return false;
    }

    @Override
    public T next() {
        while (position < list.size()){
            T elememt = list.get(position);
            if(predicate.test(elememt)){
                position++;
                return elememt;
            }
            else position++;
        }
        return null;
    }
}
