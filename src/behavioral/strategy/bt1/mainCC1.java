package behavioral.strategy.bt1;

public class mainCC1 {
    public static void main(String[] args) {
        Context c = new Context();
        float kq1 = c.setTinh(new Cong()).tinh(3,5);
        float kq2 = c.setTinh(new Nhan()).tinh(3,5);
        System.out.println(kq1 + "\t" + kq2);
    }
}
