package structural.composite.bt4;

import java.util.ArrayList;
import java.util.List;

public class KeHoachHT extends HocTap{
    List<HocTap> list = new ArrayList<>();
    public KeHoachHT(String ten) {
        super(ten);
    }

    @Override
    public void add(HocTap e) {
        list.add(e);
        e.p = this.p + "\t";
    }

    @Override
    public void remove(HocTap e) {
        list.remove(e);
    }

    @Override
    public String getCTDT() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten).append(":\t")
                .append("Tín chỉ: ").append(this.tinChi()).append(";\t")
                .append("Học Phí: ").append(this.hocPhi());
        for(var e : list)
            builder.append("\n").append(e.p).append(e.getCTDT());
        return builder.toString();
    }

    @Override
    public int tinChi() {
        int t = 0;
        for(var e : list)
            t += e.tinChi();
        return t;
    }

    @Override
    public int hocPhi() {
        int t = 0;
        for(var e : list)
            t += e.hocPhi();
        return t;
    }
}
