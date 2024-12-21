package creational.builder.bt1;

public class CTHD {
    String sp, soLuong, donGia, chietKhau;

    public CTHD(String sp, String soLuong, String donGia, String chietKhau) {
        this.sp = sp;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    protected CTHD(Builder b) {
        this.sp = b.sp;
        this.soLuong = b.soLuong;
        this.donGia = b.donGia;
        this.chietKhau = b.chietKhau;
    }

    public static class Builder{
        String sp, soLuong, donGia, chietKhau;

        public Builder addSP(String sp){
            this.sp = sp;
            return this;
        }
        public Builder addSoLuong(String soLuong){
            this.soLuong = soLuong;
            return this;
        }
        public Builder addDonGia(String donGia){
            this.donGia = donGia;
            return this;
        }
        public Builder addChietKhau(String chietKhau){
            this.chietKhau = chietKhau;
            return this;
        }

        public CTHD build(){
            return new CTHD(this);
        }
    }
}
