package decorator;

// 양상추 토핑 추가를 위한 데코레이터
public class LettuceDecorator extends ToppingDecorator {
    // 가장 마지막으로 생성자(bread 클래스, 최상위 클래스) 기준으로 샌드위치 생성
    public LettuceDecorator(Sandwich sandwich){
        super(sandwich);
    }

    // 상위 클래스 호출을 통해 토핑을 추가하고 넘겨줌
    public void make(){
        super.make();
        addLettuce();
    }

    private void addLettuce(){
        System.out.println(" + 양상추");
    }
}
