package behavioral.observer.bt4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements TopicListener{
    Topic topic;
    List<TinTuc> list = new ArrayList<>();

    public ThanhVienB(Topic topic) {
        this.topic = topic;
        this.topic.register(this);
    }

    @Override
    public void listen(TinTuc t) {
        for (int i=0; i<list.size(); i++)
            if (list.get(i).id == t.id){

            }
    }
}
