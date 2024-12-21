package tomTatGK;

abstract public class FacProduct {
    StringBuilder builder = new StringBuilder();
    abstract void proc1();
    abstract void proc2();

    @Override
    public String toString() {
        return builder.toString();
    }
}

class VN_Type1 extends FacProduct{
    @Override
    void proc1() {
        builder.append("Hello ");
    }

    @Override
    void proc2() {
        builder.append("VN_Type1");
    }
}

class VN_Type2 extends FacProduct{
    @Override
    void proc1() {
        builder.append("Hi ");
    }

    @Override
    void proc2() {
        builder.append("VN_Type2");
    }
}
