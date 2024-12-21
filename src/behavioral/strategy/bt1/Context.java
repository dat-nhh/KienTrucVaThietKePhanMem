package behavioral.strategy.bt1;

public class Context {
    private Tinh tinh;

    public Context setTinh(Tinh tinh) {
        this.tinh = tinh;
        return this;
    }
    public float tinh(float a, float b){
        return tinh.tinh(a,b);
    }
}
