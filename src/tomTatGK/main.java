package tomTatGK;

public class main {
    public static void main(String[] args) {
        //singleton
        System.out.println("Singleton");
        singleton s1 = singleton.getInstance();
        s1.random(10);
        singleton_user s2 = new singleton_user(20);
        s2.doRandom();

        //builder
        System.out.println("\nBuilder");
        builder b = new builder.Builder().addTen("Hello")
                .addList("123456")
                .addList("abcxyz")
                .addList("end")
                .build();
        System.out.println(b.toString());;

        //factory
        System.out.println("\nFactory");
        FacCreator f = new VN_Creator();
        FacProduct p1 = f.doProc(FacType.Type1);
        FacProduct p2 = f.doProc(FacType.Type2);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
