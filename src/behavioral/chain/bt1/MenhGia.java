package behavioral.chain.bt1;

public class MenhGia extends MenhGiaATM{
    MenhGiaATM mgNhoHon;
    public MenhGia(int menhGia) {
        super(menhGia);
    }

    @Override
    public void rutTien(int tienRut) {
        if (tienRut >= menhGia) {
            this.soTo++;
            rutTien(tienRut - menhGia);
        } else {
            if (soTo != 0)
                System.out.println("Có " + soTo + " mệnh giá " + menhGia);
            mgNhoHon.rutTien(tienRut);
        }
    }

    @Override
    public MenhGiaATM mgNhoHon(MenhGiaATM mg) {
        mgNhoHon = mg;
        return mgNhoHon;
    }
}
