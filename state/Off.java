package state;

// 각 상태를 클래스로 구현
public class Off implements PowerState{
    public void powerPush() {
        System.out.println("절전 모드");
    }
}
