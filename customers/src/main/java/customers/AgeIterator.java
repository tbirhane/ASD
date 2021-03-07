package customers;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class AgeIterator<T> implements Iterator<T> {

    private List<T> list;
    private int position;
    public AgeIterator(List<T> list, Comparator<T> comparator){
        this.list = list;
        position = 0;
        Collections.sort(this.list, comparator);
    }

    public Iterator<T> getIterator(){
        return this;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public T next() {
        if(position < list.size())
            return list.get(position++);
        return null;
    }
}
