package structural.composite.bt3;

public class MainItem {
    public static void main(String[] args) {
        Item f = new Folder("D:","16/03/2024");
        Item f1 =new Folder("Tai Lieu","16/03/2024");
        f.addItem(f1);
        Item f11=new Folder("Design Pattern","16/03/2024");
        Item f12 =new Folder("Lap Trinh Java","16/03/2024");
        Item f13 =new Folder("LapTrinhThietBiDiDong","16/03/2024");
        f1.addItem(f11);
        f1.addItem(f12);
        f1.addItem(new File("NgonNguLapTrinhC.pdf","16/03/2024"));
        f1.addItem(f13);
        f11.addItem(new File("CreationalPattern.pptx","16/03/2024"));
        f11.addItem(new File("StructuralPattern.pptx","16/03/2024"));
        f12.addItem(new File("LapTrinhJavaCoBan.docx","16/03/2024"));
        f12.addItem(new File("LapTrinhJavaNangCao.pdf","16/03/2024"));
        f13.addItem(new File("CoBan.pptx","16/03/2024"));
        f13.addItem(new File("NangCao.pptx","16/03/2024"));
        System.out.println(f.getStringTreeFolder());
        System.out.println(f13.getPath());
    }
}
