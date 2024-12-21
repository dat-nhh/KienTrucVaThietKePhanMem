package behavioral.observer.bt1;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T> {
    List<MyStreamListener> listeners = new ArrayList<MyStreamListener>();

    public void addListener(MyStreamListener l){
        listeners.add(l);
    }

    public void addEvent(T t){
        for (MyStreamListener l : listeners)
            l.listen(t);
    }
}
