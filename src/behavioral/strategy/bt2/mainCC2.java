package behavioral.strategy.bt2;

public class mainCC2 {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        qlsv.them(new SinhVien("C Nguyen Van", "2/10/2003", 6.5F));
        qlsv.them(new SinhVien("A Tran Thi", "23/3/2003", 10F));
        qlsv.them(new SinhVien("B Le Thanh", "1/1/2003",8.3F));
        qlsv.inDS();
        System.out.println("\n");
        qlsv.setSoSanh(new SoSanhTheoDiem()).sapXep();
        qlsv.inDS();
        System.out.println("\n");
        qlsv.setSoSanh(new SoSanhTheoTen()).sapXep();
        qlsv.inDS();
    }
}
