package structural.composite.bt3;

public abstract class Item {
    String ten, ngayTao, duongDan;
    String p = "";

    public Item(String ten, String ngayTao) {
        this.ten = ten;
        this.ngayTao = ngayTao;
        this.duongDan = ten;
    }

    public abstract void addItem(Item f);
    public abstract void removeItem(Item f);
    public abstract String getStringTreeFolder();
    public String getPath(){
        return duongDan;
    }
}
