package behavioral.chain.bt1;

public class MenhGiaNhoNhat extends MenhGiaATM{
    public MenhGiaNhoNhat(int menhGia) {
        super(menhGia);
    }

    @Override
    public void rutTien(int tienRut) {
        if(tienRut >= menhGia){
            this.soTo++;
            rutTien(tienRut - menhGia);
        }
        else {
            if(soTo != 0)
                System.out.println("Có " + soTo + " mệnh giá " + menhGia);
        }
    }

    @Override
    public MenhGiaATM mgNhoHon(MenhGiaATM mg) {
        return null;
    }
}
