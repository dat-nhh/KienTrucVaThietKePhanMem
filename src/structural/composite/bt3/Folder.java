package structural.composite.bt3;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Item{
    List<Item> dsPhanTu = new ArrayList<>();
    public Folder(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public void addItem(Item f) {
        dsPhanTu.add(f);
        f.duongDan = this.duongDan + "\\" + f.ten;
        f.p = this.p + "\t";
    }

    @Override
    public void removeItem(Item f) {
        dsPhanTu.remove(f);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten);
        for(var f : dsPhanTu)
            builder.append("\n").append(f.p).append(f.getStringTreeFolder());
        return builder.toString();
    }
}
