package behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class mainIterator {
    public static void duyetMHs(Iterator<MonHoc> iterator){
        while (iterator.hasNext()){
            MonHoc monHoc = iterator.next();
            System.out.println(monHoc.toString());
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<MonHoc> monHocList = new ArrayList<>(Arrays.asList(
           new MonHoc("mon 1",3),
                new MonHoc("mon 2",3),
                new MonHoc("mon 3",3),
                new MonHoc("mon 4",3),
                new MonHoc("mon 5",3)
                ));
        duyetMHs(monHocList.iterator());
    }
}
