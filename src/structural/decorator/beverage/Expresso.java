package structural.decorator.beverage;

public class Expresso extends Beverage{
    public Expresso(String description) {
        super(description);
    }

    @Override
    public int cost() {
        return 15;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
