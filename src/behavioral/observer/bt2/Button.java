package behavioral.observer.bt2;

public class Button {

    IActivity activity;

    void attach(IActivity activity){
        this.activity = activity;
    }

    void detach(IActivity activity){
        this.activity = null;
    }

    void onClick(Activity activity){
        activity.click++;
        this.activity.hienThi(this);
    }
}
