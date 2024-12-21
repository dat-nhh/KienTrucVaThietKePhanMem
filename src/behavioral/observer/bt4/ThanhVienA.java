package behavioral.observer.bt4;

public class ThanhVienA implements TopicListener{
    Topic topic;

    public ThanhVienA(Topic topic) {
        this.topic = topic;
        this.topic.register(this);
    }

    @Override
    public void listen(TinTuc t) {
        System.out.println(t.toString());
    }
}
