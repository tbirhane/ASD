package customers;

import java.util.Iterator;
import java.util.List;

public class OddIterator<T> implements Iterator<T> {
    private List<T> list;
    private int position;

    public OddIterator(List<T> list){
        this.list = list;
        this.position = 0;
    }
    @Override
    public boolean hasNext() {
        int tmpPosition = position;
        if(position%2 != 0)
            tmpPosition++;
        return tmpPosition < list.size();
    }

    @Override
    public T next() {
        T element = position < list.size()? list.get(position) : null;
        position += 2;
        return element;
    }
}
