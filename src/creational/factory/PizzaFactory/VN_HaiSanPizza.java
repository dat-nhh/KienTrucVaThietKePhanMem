package creational.factory.PizzaFactory;

public class VN_HaiSanPizza extends Pizza{
    @Override
    void prepare(){
        builder.append("Bột và 4 con cá");
    }
    @Override
    void bake(){
        builder.append("\n").append("Nướng lò gạch");
    }
    @Override
    void cut(){
        builder.append("\n").append("Cắt làm 4");
    }
    @Override
    void box(){
        builder.append("\n").append("Hộp tròn");
    }
}
