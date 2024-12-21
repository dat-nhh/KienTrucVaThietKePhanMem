package behavioral.iterator.bt2;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrayAggregate implements Iterable{
    private int[] array = {1,2,3,4,5,6,7,8,9,10};

    public int getItem(int i){
        return array[i];
    }

    public int count(){
        return array.length;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator(this);
    }

}
