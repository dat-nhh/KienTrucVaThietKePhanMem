package behavioral.chain.f88;

public class mainF88 {
    public static void main(String[] args) {
        NhanVienF88 baoVe = new NhanVien("Đức","Bảo vệ", 500000);
        NhanVienF88 nvGiaoDich = new NhanVien("Linh","Nhân viên giao dịch", 50000000);
        NhanVienF88 truongPhong = new NhanVien("Tuấn", "Trưởng phòng giao dịch", 500000000);
        NhanVienF88 chuTich = new ChuTich("Vượng","Chủ tịch",999999999);
        baoVe.capTren(nvGiaoDich)
                .capTren(truongPhong)
                .capTren(chuTich);
        baoVe.duyetVay(600000000);
    }
}
