package structural.decorator.bt1;

public class GiaTriTuyetDoi extends BieuThucDecorator{
    public GiaTriTuyetDoi(BieuThuc bieuThuc) {
        super(bieuThuc);
    }

    @Override
    public float giaTri() {
        if(super.giaTri()>0)
            return super.giaTri();
        else
            return super.giaTri()*-1;
    }

    @Override
    public String bieuThuc() {
        return "|"+super.bieuThuc()+"|";
    }
}
