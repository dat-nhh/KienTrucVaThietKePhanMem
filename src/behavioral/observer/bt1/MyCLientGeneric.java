package behavioral.observer.bt1;

import java.util.function.Consumer;

public class MyCLientGeneric<T> implements MyStreamListener<T>{
    MyStream<T> stream;
    Consumer<T> consumer;

    public MyCLientGeneric(MyStream<T> stream, Consumer<T> consumer) {
        this.stream = stream;
        this.consumer = consumer;
        this.stream.addListener(this);
    }

    @Override
    public void listen(T t) {
        consumer.accept(t);
    }
}
