package creational.builder.bt1;

public class mainHD {
    public static void main(String[] args) {
        HoaDon hd1 = new HoaDon.Builder()
                .setHeader("M1", "13/10/2003", "Nguyen Hoai Huy Dat")
                .setCthd("Cam", "1", "10000", "10%")
                .setCthd("Tao", "2", "30000", "0%")
                .setCthd("Chuoi", "1", "25000", "15%")
                .build();
        System.out.println(hd1.toString());
    }
}
