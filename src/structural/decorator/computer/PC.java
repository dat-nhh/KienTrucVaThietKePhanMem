package structural.decorator.computer;

abstract public class PC {
    String main, cpu, ram, storage, screen;
    int vMain, vCpu, vRam, vStorage, vScreen;
    abstract String build();
    abstract int value();

    public String getMain() {
        return main;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getScreen() {
        return screen;
    }

    public int getvMain() {
        return vMain;
    }

    public int getvCpu() {
        return vCpu;
    }

    public int getvRam() {
        return vRam;
    }

    public int getvStorage() {
        return vStorage;
    }

    public int getvScreen() {
        return vScreen;
    }
}
