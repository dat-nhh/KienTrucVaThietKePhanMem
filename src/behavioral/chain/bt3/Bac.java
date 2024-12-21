package behavioral.chain.bt3;

public class Bac extends GiaDien{
    GiaDien bacTren;

    public Bac(String id, int gia, int min, int max) {
        super(id, gia, min, max);
    }

    @Override
    void tinhTien(int mucsudung, int tong) {
        if(mucsudung >= max){
            tong += (max-min)*gia;
            System.out.println(id + ": " + min + "-->" + max + ": " + (max-min) + "x" + gia + " = " + (max-min)*gia);
            bacTren.tinhTien(mucsudung, tong);
        }

    }

    @Override
    GiaDien bacTren(GiaDien b) {
        bacTren = b;
        return bacTren;
    }
}
