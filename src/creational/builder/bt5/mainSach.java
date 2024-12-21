package creational.builder.bt5;

public class mainSach {
    public static void main(String[] args) {
        Sach s1 = new Sach.Builder().addTuaDe("Sách ABC")
                .addTacGia("Nguyễn Anh")
                .addSoTrang(26)
                .addChuong("A").addChuong("B").addChuong("C")
        .build();
        System.out.println(s1.toString());
    }
}
