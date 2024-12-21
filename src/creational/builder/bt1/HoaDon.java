package creational.builder.bt1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader header;
    List<CTHD> cthds = new ArrayList<>();
    private HoaDon(Builder b){
        header = b.header;
        cthds = b.cthds;
    }

    @Override
    public String toString() {
        String s = "HoaDon{" +
                "HoaDonHeader{" +
                "maHD='" + header.maHD + '\'' +
                ", ngay='" + header.ngay + '\'' +
                ", tenKH='" + header.tenKH + '\'' +
                '}';
        for(CTHD c : cthds){
            s += "\nCTHD{" +
                    "sp='" + c.sp + '\'' +
                    ", soLuong='" + c.soLuong + '\'' +
                    ", donGia='" + c.donGia + '\'' +
                    ", chietKhau='" + c.chietKhau + '\'' +
                    '}';
        }
        return s;
    }

    public static class Builder{
        HoaDonHeader header;
        List<CTHD> cthds = new ArrayList<>();

        public Builder setHeader(String maHD, String ngay, String tenKH) {
            header = new HoaDonHeader(maHD, ngay, tenKH);
            return this;
        }

        public Builder setCthd(String sp, String soLuong, String donGia, String chietKhau) {
            CTHD cthd = new CTHD(sp, soLuong, donGia, chietKhau);
            cthds.add(cthd);
            return this;
        }

        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
