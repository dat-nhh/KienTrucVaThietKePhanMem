package bt_java.bt4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> dsChuyenXe = new ArrayList<>();
    public void them(ChuyenXe cs){dsChuyenXe.add(cs);}
    public void inDS(){
        for(var cs:dsChuyenXe)
            System.out.println(cs.toString());
    }
    public int doanhThuTong(){
        int tong = 0;
        for(var cs:dsChuyenXe)
            tong += cs.doanhThu;
        return tong;
    }
    public int doanhThuNoi(){
        int tong = 0;
        for(var cs:dsChuyenXe)
            if(cs instanceof ChuyenXeNoiThanh)
                tong += cs.doanhThu;
        return tong;
    }
    public int doanhThuNgoai(){
        int tong = 0;
        for(var cs:dsChuyenXe)
            if(cs instanceof ChuyenXeNgoaiThanh)
                tong += cs.doanhThu;
        return tong;
    }
}
