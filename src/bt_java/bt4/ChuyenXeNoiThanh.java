package bt_java.bt4;

public class ChuyenXeNoiThanh extends ChuyenXe{
    int soTuyen, soKm;
    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, int doanhThu, int soTuyen, int soKm) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    @Override
    public String toString() {
        return "ChuyenXeNoiThanh{" +
                "soTuyen=" + soTuyen +
                ", soKm=" + soKm +
                ", maSoChuyen='" + maSoChuyen + '\'' +
                ", hoTenTaiXe='" + hoTenTaiXe + '\'' +
                ", soXe='" + soXe + '\'' +
                ", doanhThu=" + doanhThu +
                '}';
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }
}
