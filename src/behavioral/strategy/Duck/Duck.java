package behavioral.strategy.Duck;

public abstract class Duck {
    IFlyable flyable;
    IQuackable quackable;
    public abstract void display();
    public void performQuack(){
        System.out.println(quackable.quack());
    };
    public void performFly(){
        System.out.println(flyable.fly());
    }

    public IFlyable getFlyable() {
        return flyable;
    }

    public void setFlyable(IFlyable flyable) {
        this.flyable = flyable;
    }

    public IQuackable getQuackable() {
        return quackable;
    }

    public void setQuackable(IQuackable quackable) {
        this.quackable = quackable;
    }
}
