package creational.builder.bt2;

public class mainStringBuilder {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.appendString("Lam xong ngu").appendString("\t").appendString("ngu").addFloat(5.5F).appendString("Thong minh");
        System.out.println(myStringBuilder.toString());
    }
}
