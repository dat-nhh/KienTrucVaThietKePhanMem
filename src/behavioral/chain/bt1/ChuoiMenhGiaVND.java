package behavioral.chain.bt1;

public class ChuoiMenhGiaVND extends ChuoiMenhGiaFactory{
    MenhGiaATM to500, to100, to50, to10,to1;
    public ChuoiMenhGiaVND() {
        to500 = new MenhGia(500);
        to100 = new MenhGia(100);
        to50 = new MenhGia(50);
        to10 = new MenhGia(10);
        to1 = new MenhGiaNhoNhat(1);
        to500.mgNhoHon(to100)
                .mgNhoHon(to50)
                .mgNhoHon(to10)
                .mgNhoHon(to1);
    }

    @Override
    MenhGiaATM getChuoiMenhGia(int menhGia) {
        switch (menhGia){
            case 500: return to500;
            case 100: return to100;
            case 50: return to50;
            case 10: return to10;
            default: return to1;
        }
    }
}
