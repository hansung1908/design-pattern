package state;

public class Client {
    public static void main(String args[]){
        Laptop laptop = new Laptop();

//        laptop.powerPush();
//        laptop.setPowerState(Laptop.ON);
//        laptop.powerPush();
//        laptop.setPowerState(Laptop.SAVING);
//        laptop.powerPush();
//        laptop.setPowerState(Laptop.OFF);
//        laptop.powerPush();
//        laptop.setPowerState(Laptop.ON);
//        laptop.powerPush();

        On on = new On();
        Off off = new Off();
        Saving saving = new Saving();

        laptop.powerPush();
        laptop.setPowerState(on);
        laptop.powerPush();
        laptop.setPowerState(saving);
        laptop.powerPush();
        laptop.setPowerState(off);
        laptop.powerPush();
        laptop.setPowerState(on);
        laptop.powerPush();
    }
}