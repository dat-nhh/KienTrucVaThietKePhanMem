package creational.singleton.bt4;

public class User {
    String MaSo, Hoten;

    public User(String maSo, String hoten) {
        MaSo = maSo;
        Hoten = hoten;
    }

    public void vote(Candidate candidate){
        ELection.getInstance().vote(candidate, MaSo);
    }
}
