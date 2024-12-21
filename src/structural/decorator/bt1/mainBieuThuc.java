package structural.decorator.bt1;

public class mainBieuThuc {
    public static void main(String[] args) {
        BieuThuc b = new BieuThucDonGian(8);
        b = new Cong(b,6);
        b = new Chia(b,2);
        b = new Nhan(b,5);
        b = new Tru(b,40);
        b = new GiaTriTuyetDoi(b);
        System.out.println(b.bieuThuc());
        System.out.println(b.giaTri());
        System.out.println(b.toString());
    }
}
