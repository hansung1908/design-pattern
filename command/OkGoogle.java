package command;

public class OkGoogle {
//    // command 인터페이스를 통해 모든 기능 실행을 run 메소드로 통일
//    private static String[] modes = {"heater", "lamp"};
//
//    private Heater heater;
//    private Lamp lamp;
//    private String mode;

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

//    OkGoogle(Heater heater, Lamp lamp){
//        this.heater = heater;
//        this.lamp = lamp;
//    }
//
//    public void setMode(int idx){
//        this.mode = modes[idx];
//    }

    public void talk(){
//        // 기능이 늘어날 수록 분기도 늘어나 코드를 수정해야 하므로 ocp 위배
//        switch(this.mode){
//            case "heater":
//                this.heater.powerOn();
//                break;
//            case "lamp":
//                this.lamp.turnOn();
//                break;
//        }

        command.run();

    }
}
