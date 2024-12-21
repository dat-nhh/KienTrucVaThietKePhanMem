package behavioral.strategy.Duck;

public class VitDong extends Duck{
    @Override
    public void display(){
        System.out.println("vịt đồng");
        performFly();
        performQuack();
    }
}
