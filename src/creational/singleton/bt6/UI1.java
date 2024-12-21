package creational.singleton.bt6;

public class UI1 {
    public UI1() {
    }

    public void them(String maSP, String tenSP, int soLuong, int donGia){
        SanPham s = new SanPham(maSP, tenSP, soLuong, donGia);
        dataAccess.getInstance().add(maSP);
    }

    public void xoa(SanPham sp){
        dataAccess.getInstance().delete(sp.maSP);
    }


}
