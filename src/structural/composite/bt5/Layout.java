package structural.composite.bt5;

import java.util.ArrayList;
import java.util.List;

public class Layout implements UI{
    List<UI> list = new ArrayList<>();
    String ten;
    public Layout(String ten) {
        this.ten = ten;
    }

    @Override
    public void add(UI u) {
        list.add(u);
    }

    @Override
    public void remove() {

    }

    @Override
    public String show() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten);
        for(var i : list)
            builder.append("\n").append(i.show());
        return builder.toString();
    }
}
