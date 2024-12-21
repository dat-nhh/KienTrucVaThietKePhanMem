package creational.factory.PizzaFactory;

public class VN_PizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType p) {
        //switch case
        return new VN_HaiSanPizza();
    }
}
