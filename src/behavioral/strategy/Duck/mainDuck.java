package behavioral.strategy.Duck;

public class mainDuck {
    public static void main(String[] args) {
        Duck d1 = new VitQuay();
        d1.setFlyable(new BayTrenLoThan());
        d1.setQuackable(new Mute());
        d1.display();
        Duck d2 = new VitDong();
        d2.setFlyable(new BayTrenTroi());
        d2.setQuackable(new Quack());
        d2.display();
        Duck d3 = new VitCaoSu();
        d3.setFlyable(new BayTrenMatNuoc());
        d3.setQuackable(new Squeak());
        d3.display();
    }
}
