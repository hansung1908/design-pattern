package decorator;

// 빵은 기본적으로 있어야 하는 것임으로 데코레이터가 아닌 클래스로 정의
public class Bread extends Sandwich {
    // 가장 마지막 생성자로 추가됨으로 샌드위치 토핑 추가는 여기서 끝
    public void make(){
        System.out.println("빵추가");
    }
}