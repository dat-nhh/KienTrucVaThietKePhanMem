package behavioral.chain.bt3;

public class mainDien {
    public static void main(String[] args) {
        GiaDien b1 = new Bac("Bậc 1", 1806, 0, 50);
        GiaDien b2 = new Bac("Bậc 2", 1866, 50, 100);
        GiaDien b3 = new Bac("Bậc 3", 2167, 100, 200);
        GiaDien b4 = new Bac("Bậc 4", 2729, 200, 300);
        GiaDien b5 = new Bac("Bậc 5", 3050, 300, 400);
        GiaDien b6 = new BacCaoNhat("Bậc 6",3151,400,0);
        b1.bacTren(b2).bacTren(b3).bacTren(b4).bacTren(b5).bacTren(b6);
        b1.tinhTien(450,0);
    }
}
