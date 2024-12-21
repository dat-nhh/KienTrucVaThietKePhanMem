package creational.singleton.bt6;

import java.util.ArrayList;
import java.util.List;

public class dataAccess {
    private static dataAccess instance;
    List<String> dsSP =new ArrayList<>();
    private dataAccess() {
    }

    public static dataAccess getInstance() {
        if(instance == null)
            instance =new dataAccess();
        return instance;
    }

    public void add(String s){
        dsSP.add(s);
    }

    public void delete(String s){
        int c = 0;
        for(String sp : dsSP){
            if(s == sp)
                dsSP.remove(c);
            c++;
        }
    }
}
