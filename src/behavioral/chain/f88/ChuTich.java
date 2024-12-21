package behavioral.chain.f88;

public class ChuTich extends NhanVienF88{
    public ChuTich(String ten, String chucVu, int hanMucDuyetVay) {
        super(ten, chucVu, hanMucDuyetVay);
    }

    @Override
    public void duyetVay(int tienVay) {
        if(tienVay <= hanMucDuyetVay)
            System.out.println(chucVu + " " + ten + " duyệt mức vay " + tienVay);
        else
            System.out.println("Ra Eximbank vay");
    }

    @Override
    public NhanVienF88 capTren(NhanVienF88 nv) {
        return null;
    }
}
