package behavioral.observer.bt4;

public class TinTuc {
    String id, tuaDe;

    public TinTuc(String id, String tuaDe) {
        this.id = id;
        this.tuaDe = tuaDe;
    }

    @Override
    public String toString() {
        return "TinTuc{" +
                "id='" + id + '\'' +
                ", tuaDe='" + tuaDe + '\'' +
                '}';
    }
}
