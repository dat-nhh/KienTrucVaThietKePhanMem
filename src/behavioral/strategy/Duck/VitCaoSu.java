package behavioral.strategy.Duck;

public class VitCaoSu extends Duck{
    @Override
    public void display(){
        System.out.println("vịt cao su");
        performFly();
        performQuack();
    }
}
