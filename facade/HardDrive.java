package facade;

public class HardDrive {

    public byte[] read(long bootSector, int sectorSize) {
        byte[] result = new byte[sectorSize];
        System.out.println("bootSector : " + bootSector + ", sectorSize : " + sectorSize);
        return result;
    }
}
