package structural.composite.bt5;

public class Component implements UI{
    String ten;

    public Component(String ten) {
        this.ten = ten;
    }

    @Override
    public void add(UI u) {

    }

    @Override
    public void remove() {

    }

    @Override
    public String show() {
        return ten;
    }
}
