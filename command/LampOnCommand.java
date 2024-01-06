package command;

// 램프 전원 기능을 객체화하기 위한 클래스
public class LampOnCommand implements Command{
    private Lamp lamp;

    public LampOnCommand(Lamp lamp){
        this.lamp = lamp;
    }

    public void run(){
        // 실행 기능 정의
        lamp.turnOn();
    }
}
