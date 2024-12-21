package behavioral.iterator.bt1;

public class ArrayIterator implements MyIterator{
    ArrayAggregate array;
    int index = -1;

    public ArrayIterator(ArrayAggregate array) {
        this.array = array;
    }

    @Override
    public Object first() {
        if(!isDone()) {
            index = 0;
            return array.getItem(index);
        }
        else
            return null;
    }

    @Override
    public Object next() {
        return array.getItem(++index);
    }

    @Override
    public boolean isDone() {
        if(index == array.count() - 1)
            return true;
        else
            return false;
    }

    @Override
    public Object currentItem() {
        if (index >= 0)
            return array.getItem(index);
        else
            return null;
    }
}
