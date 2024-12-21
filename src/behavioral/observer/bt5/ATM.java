package behavioral.observer.bt5;

public class ATM {
    ITaiKhoan taiKhoan;

    public void attach(ITaiKhoan taiKhoan){
        this.taiKhoan = taiKhoan;
    }

    public void detach(){
        this.taiKhoan = null;
    }

    public void rutTien(int soTienRut){
        if(taiKhoan == null)
            System.out.println("Không có thẻ");
        else
            this.taiKhoan.nhanThongBao(soTienRut);
    }
}
