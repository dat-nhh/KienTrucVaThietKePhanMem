package behavioral.observer.bt5;

public class TaiKhoan implements ITaiKhoan{
    ATM atm;
    int soDu;

    public TaiKhoan(ATM atm, int soDu) {
        this.atm = atm;
        this.soDu = soDu;
    }

    public void duaThe(){
        atm.attach(this);
    }

    public void rutThe(){
        atm.detach();
    }

    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        if(soDu - soTienRut >= 50000)
            return true;
        else
            return false;
    }

    @Override
    public void nhanThongBao(int soTienRut) {
        if(this.kiemTraSoDu(soTienRut)){
            soDu -= soTienRut;
            System.out.println("Đã rút "+soTienRut+" từ tài Khoản");
        }
        else
            System.out.println("Không đủ tiền rút");
        System.out.println("Số dư tài khoản: "+ soDu);
    }
}
