package tomTatGK;

import java.util.Random;

public class singleton {
    private static singleton instance;
    int count = 0;
    private singleton(){}
    public static singleton getInstance(){
        if(instance==null)
            instance = new singleton();
        return instance;
    }

    public void random(int r){
        System.out.println((new Random()).nextInt(r));
        System.out.println("Số lần random: " + ++count);
    }
}

class singleton_user {
    int random;
    public singleton_user(int random) {
        this.random = random;
    }
    public void doRandom(){
        singleton.getInstance().random(random);
    }
}
