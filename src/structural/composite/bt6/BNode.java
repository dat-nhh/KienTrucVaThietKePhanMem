package structural.composite.bt6;

public abstract class BNode {
    int value;
    String p = "";

    public BNode(int value) {
        this.value = value;
    }

    public abstract void addL(BNode node);
    public abstract void addR(BNode node);
    public abstract void removeL(BNode node);
    public abstract void removeR(BNode node);
    public abstract String travel();
}
