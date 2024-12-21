package structural.decorator.computer;

public class ConcretePC extends PC{
    public ConcretePC(String main, String cpu, String ram, String storage, String screen, int vMain, int vCpu, int vRam, int vStorage, int vScreen) {
        this.main = main;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.vMain = vMain;
        this.vCpu = vCpu;
        this.vRam = vRam;
        this.vStorage = vStorage;
        this.vScreen = vScreen;
    }

    @Override
    String build() {
        return "ConcretePC{" +
                "main='" + main + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    @Override
    int value() {
        return vMain + vCpu + vRam + vStorage + vScreen;
    }

    @Override
    public String getMain() {
        return super.getMain();
    }

    @Override
    public String getCpu() {
        return super.getCpu();
    }

    @Override
    public String getRam() {
        return super.getRam();
    }

    @Override
    public String getStorage() {
        return super.getStorage();
    }

    @Override
    public String getScreen() {
        return super.getScreen();
    }

    @Override
    public int getvMain() {
        return super.getvMain();
    }

    @Override
    public int getvCpu() {
        return super.getvCpu();
    }

    @Override
    public int getvRam() {
        return super.getvRam();
    }

    @Override
    public int getvStorage() {
        return super.getvStorage();
    }

    @Override
    public int getvScreen() {
        return super.getvScreen();
    }
}
