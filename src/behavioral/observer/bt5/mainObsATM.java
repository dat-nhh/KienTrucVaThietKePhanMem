package behavioral.observer.bt5;

public class mainObsATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan t1 = new TaiKhoan(atm, 90000);
        t1.duaThe();
        atm.rutTien(30000);
        t1.rutThe();
        atm.rutTien(10000);
        System.out.println("TK2");
        TaiKhoan t2 = new TaiKhoan(atm, 1000000);
        t2.duaThe();
        atm.rutTien(9500000);
        t2.rutThe();
    }
}
