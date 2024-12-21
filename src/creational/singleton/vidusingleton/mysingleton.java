package creational.singleton.vidusingleton;

public class mysingleton {
    //khai báo biến
    private static  mysingleton instance;
    int count = 0;
    //hàm khởi tạo phải là private hoặc là protected
    private mysingleton() {
    }

    public static mysingleton getInstance() {
        if(instance == null)
            instance = new mysingleton();
        return instance;
    }

    public void inCount() {
        System.out.println(++count);
    }
}
