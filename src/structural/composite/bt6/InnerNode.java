package structural.composite.bt6;

public class InnerNode extends BNode{
    BNode left, right;

    public InnerNode(int value) {
        super(value);
    }

    @Override
    public void addL(BNode node) {
        left = node;
    }

    @Override
    public void addR(BNode node) {
        right = node;
    }

    @Override
    public void removeL(BNode node) {
        left = null;
    }

    @Override
    public void removeR(BNode node) {
        right = null;
    }

    @Override
    public String travel() {
        StringBuilder builder = new StringBuilder();
        this.p += "\t";
        builder.append(this.value);
        if(left!=null) {
            left.p += this.p;
            builder.append("\n").append(left.p).append("Left: ").append(left.travel());
        }
        if(right!=null) {
            right.p += this.p;
            builder.append("\n").append(right.p).append("Right: ").append(right.travel());
        }
        this.p = "";
        return builder.toString();
    }
}
