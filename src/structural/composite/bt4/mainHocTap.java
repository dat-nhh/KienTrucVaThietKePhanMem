package structural.composite.bt4;

public class mainHocTap {
    public static void main(String[] args) {
        HocTap K63 = new KeHoachHT("Khóa 63");
        HocTap Nam2223 = new KeHoachHT("Năm 2022-2023");
        HocTap Ky3 = new KeHoachHT("Kỳ 3");
        HocTap Ky4 = new KeHoachHT("Kỳ 4");
        HocTap Nam2324 = new KeHoachHT("Năm 2023-2024");
        HocTap Ky5 = new KeHoachHT("Kỳ 5");
        HocTap Ky6 = new KeHoachHT("Kỳ 6");
        K63.add(Nam2223);
        Nam2223.add(Ky3);
        Nam2223.add(Ky4);
        K63.add(Nam2324);
        Nam2324.add(Ky5);
        Nam2324.add(Ky6);
        Ky3.add(new MonHoc("Cơ sở dữ liệu",3,1110000));
        Ky3.add(new MonHoc("Kỹ thuật lập trình",3,1110000));
        Ky4.add(new MonHoc("Hệ quản trị cơ sở dữ liệu",3,1110000));
        Ky4.add(new MonHoc("Lập trình hướng đối tượng",3,1110000));
        Ky5.add(new MonHoc("Thống kê máy tính",3,1350000));
        Ky5.add(new MonHoc("Phát triển ứng dụng Web",3,1350000));
        Ky6.add(new MonHoc("Lập trình thiết bị di động",3,1350000));
        Ky6.add(new MonHoc("Kiến trúc và thiết kế phần mềm",3,1350000));
        System.out.println(K63.getCTDT());
    }
}
