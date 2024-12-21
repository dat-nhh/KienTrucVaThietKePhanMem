package structural.composite.bt4;

public class MonHoc extends HocTap{
    int tinChi, hocPhi;
    public MonHoc(String ten, int tinChi, int hocPhi) {
        super(ten);
        this.tinChi = tinChi;
        this.hocPhi = hocPhi;
    }

    @Override
    public void add(HocTap e) {

    }

    @Override
    public void remove(HocTap e) {

    }

    @Override
    public String getCTDT() {
        return this.ten + ":\tTín chỉ: " + this.tinChi() + ";\tHọc Phí: " + this.hocPhi();
    }

    @Override
    public int tinChi() {
        return this.tinChi;
    }

    @Override
    public int hocPhi() {
        return this.hocPhi;
    }
}
