package structural.composite.bt5;

public class mainUI {
    public static void main(String[] args) {
        Layout l0 = new Layout("Scaffold");
        Layout l11 = new Layout("Header");
        Layout l12 = new Layout("Body");
        Layout l2 = new Layout("Center");
        l0.add(l11);
        l0.add(l12);
        l12.add(l2);
        l11.add(new Component("Title"));
        l2.add(new Component("Text"));
        System.out.println(l0.show());
    }
}
