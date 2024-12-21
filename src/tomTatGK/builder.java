package tomTatGK;

import java.util.ArrayList;
import java.util.List;

public class builder {
    String ten;
    List<String> list = new ArrayList<>();

    public builder(Builder b) {
        this.ten = b.ten;
        this.list = b.list;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append(ten);
        for(String e : list)
            b.append("\n").append(e);
        return b.toString();
    }

    public static class Builder{
        String ten;
        List<String> list = new ArrayList<>();

        public Builder addTen(String ten){
            this.ten = ten;
            return this;
        }

        public Builder addList(String e){
            this.list.add(e);
            return this;
        }
        public builder build(){
            return new builder(this);
        }
    }
}
