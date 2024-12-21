package bt_java.bt4;

public class mainBT4 {
    public static void main(String[] args) {
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        qlcx.them(new ChuyenXeNgoaiThanh("M101", "Huy Dat", "79-A9-1234", 10000, "Nha Trang", 3));
        qlcx.them(new ChuyenXeNoiThanh("M102", "Van Ba", "81-H1-0987", 20000, 2, 30));
        qlcx.inDS();
        System.out.println("Doanh thu noi thanh: " + qlcx.doanhThuNoi());
        System.out.println("Doanh thu ngoai thanh: " + qlcx.doanhThuNgoai());
        System.out.println("Doanh thu tong: " + qlcx.doanhThuTong());
    }
}
