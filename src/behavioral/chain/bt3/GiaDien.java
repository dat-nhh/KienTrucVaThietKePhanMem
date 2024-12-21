package behavioral.chain.bt3;

public abstract class GiaDien {
    String id;
    int gia, min, max;

    public GiaDien(String id, int gia, int min, int max) {
        this.id = id;
        this.gia = gia;
        this.min = min;
        this.max = max;
    }

    abstract void tinhTien(int mucsudung, int tong);
    abstract GiaDien bacTren(GiaDien b);
}
