package bt_java.bt5;

public class LopHoc {
    IQLDS qldsHS = new QLDS();
    IQLDS qldsGV = new QLDS();
    GiaoVien gv;
    public LopHoc(GiaoVien gv) {
        this.gv = gv;
    }
    int themGV(GiaoVien gv){ return qldsGV.them(gv);}
    void inDSHS(){ qldsHS.inDS();}
}
