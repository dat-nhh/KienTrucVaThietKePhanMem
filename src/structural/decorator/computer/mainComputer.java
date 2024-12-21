package structural.decorator.computer;

public class mainComputer {
    public static void main(String[] args) {
        PC pc = new ConcretePC("B160M","i3-13200H","8GB","128GB","1900x1080",10,10,10,10,10);
        System.out.println(pc.build());
        System.out.println(pc.value());
        pc = new UpCPU(pc,"i5-14200H",30);
        System.out.println(pc.build());
        System.out.println(pc.value());
        pc = new UpRam(pc,"16GB",20);
        System.out.println(pc.build());
        System.out.println(pc.value());
    }
}
