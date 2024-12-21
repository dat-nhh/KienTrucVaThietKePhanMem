package bt_java.bt1;

public class NhanVien {
    String ten, diaChi;
    int tuoi, tongSoGioLam;
    double luong;

    public NhanVien() {
    }

    public NhanVien(String ten, String diaChi, int tuoi, int tongSoGioLam, double luong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.tongSoGioLam = tongSoGioLam;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", tuoi=" + tuoi +
                ", tongSoGioLam=" + tongSoGioLam +
                ", luong=" + luong +
                '}';
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double tinhThuong()
    {
        if(this.tongSoGioLam >= 200)
            return this.luong*0.2;
        if(this.tongSoGioLam < 200 && this.tongSoGioLam >= 100)
            return this.luong*0.1;
        return 0;
    }
}
