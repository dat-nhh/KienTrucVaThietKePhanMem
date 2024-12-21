package behavioral.observer.bt1;

import java.util.List;

public class mainStream {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream = new MyStream<>();
        DataAccess dataAccess = new DataAccess(stream);
//        MyClient client = new MyClient(stream);
        MyCLientGeneric<List<MonHoc>> client = new MyCLientGeneric<>(stream, monHocs -> {
            for(MonHoc monHoc : monHocs)
                System.out.println(monHoc.toString());
        });
        System.out.println("Lần 1");
        dataAccess.add(new MonHoc("01","Toán",3));
        System.out.println("Lần 2");
        dataAccess.add(new MonHoc("02","Hóa",2));

    }
}
