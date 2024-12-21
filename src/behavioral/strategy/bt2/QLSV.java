package behavioral.strategy.bt2;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    ISoSanh soSanh;
    List<SinhVien> dsSV = new ArrayList<>();

    public QLSV setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
        return this;
    }
    public void them(SinhVien sv){
        dsSV.add(sv);
    }
    public void sapXep(){
        for(int i = 0; i < dsSV.size()-1; i++)
            for(int j = i+1; j < dsSV.size()-1; j++)
                if(soSanh.soSanh(dsSV.get(i), dsSV.get(j)) > 0){
                    SinhVien s = dsSV.get(i);
                    dsSV.set(i,dsSV.get(j));
                    dsSV.set(j,s);
                }
    }
    public void inDS(){
        for(SinhVien s:dsSV)
            System.out.println(s.hoTen +"\t"+ s.ngaySinh +"\t"+ s.diemTB);
    }
}
