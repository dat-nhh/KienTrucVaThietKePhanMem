package structural.composite.bt6;

public class mainBNode {
    public static void main(String[] args) {
        InnerNode n0 = new InnerNode(3);
        InnerNode n1r = new InnerNode(5);
        InnerNode n2l = new InnerNode(14);
        InnerNode n2r = new InnerNode(6);
        InnerNode n3l = new InnerNode(7);
        InnerNode n4l = new InnerNode(4);
        InnerNode n5r = new InnerNode(1);
        n0.addR(n1r);
        n1r.addL(n2l);
        n1r.addR(n2r);
        n2l.addL(new Leaf(12));
        n2r.addL(n3l);
        n3l.addL(n4l);
        n4l.addR(n5r);
        n5r.addL(new Leaf(2));
        n5r.addR(new Leaf(10));
        System.out.println(n0.travel());
    }
}
