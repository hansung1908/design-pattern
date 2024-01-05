package state;

// 각 상태를 클래스로 구현
public class Saving implements PowerState{
    public void powerPush() {
        System.out.println("전원 On");
    }
}
