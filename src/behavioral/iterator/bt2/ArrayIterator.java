package behavioral.iterator.bt2;

import java.util.Iterator;

public class ArrayIterator implements Iterator {
    ArrayAggregate array;
    int index = -1;

    public ArrayIterator(ArrayAggregate array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if(index == array.count() - 1)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        return array.getItem(++index);
    }
}
