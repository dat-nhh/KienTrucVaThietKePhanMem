package behavioral.strategy.Duck;

public class Mute implements IQuackable{
    @Override
    public String quack(){
        return "...";
    }
}
