package behavioral.observer.bt4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private List<TopicListener> listeners = new ArrayList<>();
    private List<TinTuc> list = new ArrayList<>();
    public void register(TopicListener listener){
        listeners.add(listener);
    }
    public void unregister(TopicListener listener){
        listeners.remove(listener);
    }
    public void themMoi(TinTuc t){
        for (TopicListener listener : listeners)
            listener.listen(t);
    }
    public void capNhat(TinTuc t){
        for (int i=0; i<list.size(); i++){
            if (list.get(i).id == t.id){
                list.set(i,t);
                for (TopicListener listener : listeners)
                    listener.listen(t);
                return;
            }
        }
    }
}
