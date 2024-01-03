package strategy;

// 전략 인터페이스를 통해 이동 방식 클래스 생성
public class RailStrategy implements MovableStrategy{
    public void move(){
        System.out.println("선로를 통해 이동");
    }
}
