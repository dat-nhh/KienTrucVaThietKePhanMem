package creational.builder.Computer;

public class mainComp {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .addCPU("Intel Celaron I9")
                .addRAM("128 MB")
                .addStorage("1 GB")
                .addScreen("HD 1366x768")
                .build();
        System.out.println(computer.toString());
    }
}
