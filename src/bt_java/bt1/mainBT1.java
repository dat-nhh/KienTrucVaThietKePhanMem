package bt_java.bt1;

public class mainBT1 {
    public static void main(String[] args)
    {
        NhanVien nv1 = new NhanVien("Huy Dat","Nha Trang",21,200,10000000);
        NhanVien nv2 = new NhanVien("Van Ba","Nha Trang",25,150,10000000);
        System.out.println(nv1.toString());
        System.out.println(nv2.toString());
    }
}
