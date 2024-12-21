package behavioral.observer.bt2;

public class mainButton {
    public static void main(String[] args) {
        Button button = new Button();
        Activity activity = new Activity(button);
        activity.hienThi(button);
        button.onClick(activity);
        button.onClick(activity);
        button.onClick(activity);
        button.onClick(activity);
    }
}
