package strategy;

// implements Movable 대신 extends Moving을 통해 이동 방식에 대한 정보를 상속
public class Train extends Moving{

//    // 오버라이딩을 통해 직접 수정시, ocp를 위배하고 시스템 확장시 메서드 중복문제가 발생
//    @Override
//    public void move() {
//        System.out.println("선로를 이용해 이동");
//    }
}
