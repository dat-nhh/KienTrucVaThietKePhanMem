package structural.decorator.bt2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TachTu implements Tokenize{
    String s;

    public TachTu(String s) {
        this.s = s;
    }

    @Override
    public List<String> tokenize() {
        String[] tokens = s.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(tokens));
        return list;
    }
}
