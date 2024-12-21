package structural.composite.bt4;

public abstract class HocTap {
    String ten;
    String p = "";

    public HocTap(String ten) {
        this.ten = ten;
    }

    public abstract void add(HocTap e);
    public abstract void remove(HocTap e);
    public abstract String getCTDT();
    public abstract int tinChi();
    public abstract int hocPhi();
}
