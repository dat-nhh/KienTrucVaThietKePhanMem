package behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class mainItem {
    public static void getItem(Iterator<Integer> iterator, int i){
        int count = 0;
        while(iterator.hasNext()){
            count++;
            int a = iterator.next();
            if(count == i)
                System.out.println("Phan tu thu "+i+" la "+a);
        }
    }

    public static int count(Iterator<Integer> iterator){
        int count = 0;
        while (iterator.hasNext()){
            count++;
            iterator.next();
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(6,7,9,1,3,4,5,8,2,10));
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
                System.out.println(iterator.next());
        }
        System.out.println("Count: "+count(list.iterator()));
        getItem(list.iterator(), 3);
    }
}
