package behavioral.iterator;

public class MonHoc {
    String name;
    int sotc;

    public MonHoc(String name, int sotc) {
        this.name = name;
        this.sotc = sotc;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "name='" + name + '\'' +
                ", sotc=" + sotc +
                '}';
    }
}
