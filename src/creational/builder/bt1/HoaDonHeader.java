package creational.builder.bt1;

public class HoaDonHeader {
    String maHD, ngay, tenKH;

    public HoaDonHeader(String maHD, String ngay, String tenKH) {
        this.maHD = maHD;
        this.ngay = ngay;
        this.tenKH = tenKH;
    }

    protected HoaDonHeader(Builder b) {
        this.maHD = b.maHD;
        this.ngay = b.ngay;
        this.tenKH = b.tenKH;
    }

    public static class Builder{
        String maHD, ngay, tenKH;

        public Builder addMaHD(String maHD){
            this.maHD = maHD;
            return this;
        }
        public Builder addNgay(String ngay){
            this.ngay = ngay;
            return this;
        }
        public Builder addTenKH(String tenKH){
            this.tenKH = tenKH;
            return this;
        }

        public HoaDonHeader build() {
            return new HoaDonHeader(this);
        }
    }
}
