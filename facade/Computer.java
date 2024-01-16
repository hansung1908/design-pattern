package facade;

// facade
// 부품들을 모아 실행하고 로직은 감춤
public class Computer {

    private final long BOOT_ADDRESS = 100;
    private final long BOOT_SECTOR = 200;
    private final int SECTOR_SIZE = 300;

    public void startComputer() {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();

        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}
