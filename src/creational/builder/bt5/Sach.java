package creational.builder.bt5;

import creational.builder.Computer.Computer;

import java.util.ArrayList;
import java.util.List;

public class Sach {
    private String tuaDe, tacGia;
    protected List<String> dsChuong = new ArrayList<>();
    private int soTrang;

    protected Sach(Builder b) {
        this.tuaDe = b.tuaDe;
        this.tacGia = b.tacGia;
        this.dsChuong = b.dsChuong;
        this.soTrang = b.soTrang;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Tựa đề: ").append(tuaDe).append("\n")
                .append("Tác giả: ").append(tacGia).append("\n")
                .append("Số Trang: ").append(soTrang).append("\n")
                .append("Các chương:\n");
        for(String c : dsChuong){
            builder.append(c).append("\n");
        }
        return builder.toString();
    }

    public static class Builder{
        String tuaDe, tacGia;
        List<String> dsChuong = new ArrayList<>();
        int soTrang;

        public Builder addTuaDe(String tuaDe){
            this.tuaDe = tuaDe;
            return this;
        }
        public Builder addTacGia(String tacGia){
            this.tacGia = tacGia;
            return this;
        }
        public Builder addChuong(String Chuong){
            this.dsChuong.add(Chuong);
            return this;
        }
        public Builder addSoTrang(int soTrang){
            this.soTrang = soTrang;
            return this;
        }

        public Sach build(){
            return new Sach(this);
        }
    }
}
