package command;

// 히터 전원 기능을 객체화하기 위한 클래스
public class HeaterOnCommand implements Command{
    private Heater heater;

    public HeaterOnCommand(Heater heater){
        this.heater = heater;
    }

    public void run(){
        // 실행 기능 정의
        heater.powerOn();
    }
}
