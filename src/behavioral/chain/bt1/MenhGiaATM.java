package behavioral.chain.bt1;

public abstract class MenhGiaATM {
    int menhGia;
    int soTo = 0;

    public MenhGiaATM(int menhGia) {
        this.menhGia = menhGia;
    }

    public abstract void rutTien(int tienRut);
    public abstract MenhGiaATM mgNhoHon(MenhGiaATM mg);
}
