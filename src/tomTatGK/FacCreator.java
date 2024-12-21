package tomTatGK;

abstract public class FacCreator {
    abstract FacProduct create(FacType t);
    public FacProduct doProc(FacType t){
        FacProduct product = create(t);
        product.proc1();
        product.proc2();
        return product;
    }
}

class VN_Creator extends FacCreator{
    @Override
    FacProduct create(FacType t) {
        if(t == FacType.Type1)
            return new VN_Type1();
        else
            return new VN_Type2();
    }
}
