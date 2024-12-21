package behavioral.observer.bt6;

public class mainPlayer {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData(60,40,10);
        Dashboard dashboard = new Dashboard(playerData);
        dashboard.hienThiTT(playerData);
        playerData.setThoiGian(1000);
        playerData.setCountdown(50);
        playerData.setGrade(240);
    }
}
