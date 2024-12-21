package behavioral.observer.TiGia;

public class NhaDauTuA implements TiGiaObserver{
    TiGia tiGia;

    public NhaDauTuA(TiGia tiGia) {
        this.tiGia = tiGia;
    }

    public void register(){
        tiGia.attach(this);
    }

    public void unregister(){
        tiGia.detach(this);
    }

    @Override
    public void update(float delta) {
        if (delta > 0)
            System.out.println("Nha Dau Tu A: Ban ra");
        else
            System.out.println("Nha Dau Tu A: Thu vao");
    }
}
