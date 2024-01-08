package decorator;

// 피클 토핑 추가를 위한 데코레이터
public class PickleDecorator extends ToppingDecorator {
    // 가장 마지막으로 생성자(bread 클래스, 최상위 클래스) 기준으로 샌드위치 생성
    public PickleDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    // 상위 클래스 호출을 통해 토핑을 추가하고 넘겨줌
    public void make() {
        super.make();
        addPickle();
    }

    private void addPickle() {
        System.out.println(" + 피클");
    }
}
