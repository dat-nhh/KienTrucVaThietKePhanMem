package behavioral.observer.TiGia;

public class mainTiGia {
    public static void main(String[] args) {
        TiGia t = new TiGia();
        NhaDauTuA a =  new NhaDauTuA(t);
        NhaDauTuB b = new NhaDauTuB(t);
        a.register();
        b.register();
        t.notify(5);
        a.unregister();
        System.out.println("Lan 2");
        t.notify(-5);
    }
}
