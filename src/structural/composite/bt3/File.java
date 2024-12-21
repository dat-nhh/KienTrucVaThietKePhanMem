package structural.composite.bt3;

public class File extends Item{
    public File(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public void addItem(Item f) {

    }

    @Override
    public void removeItem(Item f) {

    }

    @Override
    public String getStringTreeFolder() {
        return this.ten;
    }
}
