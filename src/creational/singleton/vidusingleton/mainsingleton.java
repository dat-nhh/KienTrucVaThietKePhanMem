package creational.singleton.vidusingleton;

public class mainsingleton {
    public static void main(String[] args) {
        mysingleton s1 = mysingleton.getInstance();
        mysingleton s2 = mysingleton.getInstance();
        s1.inCount();
        s1.inCount();
        s2.inCount();
        s1.inCount();
    }
}
