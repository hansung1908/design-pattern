package command;

public class Client {
    public static void main(String args[]){
        Heater heater = new Heater();
        Lamp lamp = new Lamp();
//        OkGoogle okGoogle = new OkGoogle(heater, lamp);

        Command heaterOnCommand = new HeaterOnCommand(heater);
        Command lampOnCommand = new LampOnCommand(lamp);
        OkGoogle okGoogle = new OkGoogle();

//        // 히터 켜짐
//        okGoogle.setMode(0);
//        okGoogle.talk();
//
//        // 램프 켜짐
//        okGoogle.setMode(1);
//        okGoogle.talk();

        // 각 기능의 command 인스턴스를 삽입하여 실행 기능을 결정
        // 히터 켜짐
        okGoogle.setCommand(heaterOnCommand);
        okGoogle.talk();

        // 램프 켜짐
        okGoogle.setCommand(lampOnCommand);
        okGoogle.talk();
    }
}
