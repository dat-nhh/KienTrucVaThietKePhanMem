package structural.decorator.computer;

public class UpCPU extends PCDecorator{
    String nCpu;
    int nvCpu;

    public UpCPU(PC pc, String nCpu, int nvCpu) {
        super(pc);
        this.nCpu = nCpu;
        this.nvCpu = nvCpu;
    }

    @Override
    String build() {
        pc.cpu = nCpu;
        return super.build();
    }

    @Override
    int value() {
        pc.vCpu = nvCpu;
        return super.value();
    }

    @Override
    public String getCpu() {
        return this.nCpu;
    }

    @Override
    public int getvCpu() {
        return this.nvCpu;
    }
}
