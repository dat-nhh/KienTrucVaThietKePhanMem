package behavioral.iterator.bt1;

import java.util.Objects;

public interface MyIterator {
    Object first();
    Object next();
    boolean isDone();
    Object currentItem();
}
