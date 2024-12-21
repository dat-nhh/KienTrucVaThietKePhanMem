package structural.decorator.computer;

public class UpRam extends PCDecorator{
    String nRam;
    int nvRam;

    public UpRam(PC pc, String nRam, int nvRam) {
        super(pc);
        this.nRam = nRam;
        this.nvRam = nvRam;
    }

    @Override
    String build() {
        pc.ram = nRam;
        return super.build();
    }

    @Override
    int value() {
        pc.vRam = nvRam;
        return super.value();
    }

    @Override
    public String getRam() {
        return nRam;
    }

    @Override
    public int getvRam() {
        return nvRam;
    }
}
