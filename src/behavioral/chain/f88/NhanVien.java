package behavioral.chain.f88;

public class NhanVien extends NhanVienF88{
    NhanVienF88 capTren;
    public NhanVien(String ten, String chucVu, int hanMucDuyetVay) {
        super(ten, chucVu, hanMucDuyetVay);
    }

    @Override
    public void duyetVay(int tienVay) {
        if(tienVay <= hanMucDuyetVay)
            System.out.println(chucVu + " " + ten + " duyệt mức vay " + tienVay);
        else
            capTren.duyetVay(tienVay);
    }

    @Override
    public NhanVienF88 capTren(NhanVienF88 nv) {
        this.capTren = nv;
        return capTren;
    }
}
