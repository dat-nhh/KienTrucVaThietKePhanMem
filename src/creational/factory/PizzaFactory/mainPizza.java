package creational.factory.PizzaFactory;

public class mainPizza {
    public static void main(String[] args) {
        PizzaStore ps = new VN_PizzaStore();
        Pizza p = ps.orderPizza(PizzaType.HAISAN);
        System.out.println(p.toString());
    }
}
