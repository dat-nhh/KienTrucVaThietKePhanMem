package behavioral.chain.bt3;

public class BacCaoNhat extends GiaDien{
    public BacCaoNhat(String id, int gia, int min, int max) {
        super(id, gia, min, max);
    }

    @Override
    void tinhTien(int mucsudung, int tong) {
        mucsudung -= min;
        tong += mucsudung*gia;
        System.out.println(id + ": " + ">" + min + ": " + mucsudung + "x" + gia + " = " + mucsudung*gia);
        System.out.println("Tổng tiền điện: " + tong);
    }

    @Override
    GiaDien bacTren(GiaDien b) {
        return null;
    }
}
