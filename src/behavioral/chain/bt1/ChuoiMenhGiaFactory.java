package behavioral.chain.bt1;

public abstract class ChuoiMenhGiaFactory {
    MenhGiaATM chuoiMenhGia;

    abstract MenhGiaATM getChuoiMenhGia(int menhGia);
    public void rutTien(int soTien, int mgCaoNhat){
        chuoiMenhGia = getChuoiMenhGia(mgCaoNhat);
        chuoiMenhGia.rutTien(soTien);
    }
}
