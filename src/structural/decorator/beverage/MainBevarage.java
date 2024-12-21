package structural.decorator.beverage;

public class MainBevarage {
    public static void main(String[] args) {
        Beverage b = new HouseBlend("Cà phê Trung Nguyên");
        b = new Milk("Sữa ông thọ",b);
        b = new Milk("Sữa Vinamilk",b);
        System.out.println(b.getDescription());
        System.out.println(b.cost());
        Beverage e = new Expresso("Cà phê Expresso");
        e = new Mocha("Mocha Latte",e);
        e =new Milk("Sữa cô gái Hà Lan",e);
        System.out.println(e.getDescription());
        System.out.println(e.cost());
    }
}
