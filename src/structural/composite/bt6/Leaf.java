package structural.composite.bt6;

public class Leaf extends BNode{
    public Leaf(int value) {
        super(value);
    }

    @Override
    public void addL(BNode node) {

    }

    @Override
    public void addR(BNode node) {

    }

    @Override
    public void removeL(BNode node) {

    }

    @Override
    public void removeR(BNode node) {

    }

    @Override
    public String travel() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.value);
        return builder.toString();
    }
}
