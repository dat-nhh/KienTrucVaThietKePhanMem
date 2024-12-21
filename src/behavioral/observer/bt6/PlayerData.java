package behavioral.observer.bt6;

public class PlayerData {
    int thoiGian, countdown, grade;
    IDashboard dashboard;

    public PlayerData(int thoiGian, int countdown, int grade) {
        this.thoiGian = thoiGian;
        this.countdown = countdown;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "PlayerData{" +
                "thoiGian=" + thoiGian +
                ", countdown=" + countdown +
                ", grade=" + grade +
                '}';
    }

    public void attach(IDashboard dashboard){
        this.dashboard = dashboard;
    }

    public void dettach(IDashboard dashboard){
        this.dashboard = null;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        dashboard.hienThiTT(this);
    }

    public void setCountdown(int countdown) {
        this.countdown = countdown;
        dashboard.hienThiTT(this);
    }

    public void setGrade(int grade) {
        this.grade = grade;
        dashboard.hienThiTT(this);
    }
}
