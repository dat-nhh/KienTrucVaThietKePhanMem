package behavioral.iterator.bt1;

public class mainIterator {
    public static void main(String[] args) {
        ArrayAggregate aggregate = new ArrayAggregate();
        MyIterator iterator = aggregate.createIterator();
        while (!iterator.isDone()){
            System.out.println(iterator.next());
        }
    }
}
