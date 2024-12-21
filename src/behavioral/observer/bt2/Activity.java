package behavioral.observer.bt2;

public class Activity implements IActivity{
    Button button;
    int click=0;

    public Activity(Button button) {
        this.button = button;
        this.button.attach(this);
    }

    @Override
    public void hienThi(Button button) {
        System.out.println("Bạn đã nhấn " +click+ " lần.");
    }
}
