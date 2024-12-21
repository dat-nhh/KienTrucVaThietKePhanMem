package bt_java.bt2;

import bt_java.bt1.NhanVien;

public class mainBT2 {
    public static void main(String[] args) {
        IQuanLy quanLy = new QuanLyNhanVien();
        quanLy.them(new NhanVien("Huy Dat","Nha Trang",21,200,10000000));
        quanLy.them(new NhanVien("Van Ba","Nha Trang",25,150,10000000));
        quanLy.inDS();
    }
}
