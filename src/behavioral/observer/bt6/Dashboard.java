package behavioral.observer.bt6;

public class Dashboard implements IDashboard{
    PlayerData data;

    public Dashboard(PlayerData data) {
        this.data = data;
        this.data.attach(this);
    }

    @Override
    public void hienThiTT(PlayerData data) {
        System.out.println(data.toString());
    }
}
