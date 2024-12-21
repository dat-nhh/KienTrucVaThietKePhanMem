package behavioral.strategy.bt2;

public class SoSanhTheoTen implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien t1, SinhVien t2){
//        if(t1.hoTen.length() == t2.hoTen.length())
//            return 0;
//        else {
//            if(t1.hoTen.length() > t2.hoTen.length())
//                return 1;
//            else
//                return -1;
//        }
        return t1.hoTen.compareTo(t2.hoTen);
    };
}
