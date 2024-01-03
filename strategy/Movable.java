package strategy;

public interface Movable {
    // 탈 것 인터페이스에서 이동 방식을 결정하지 않고 전략 인터페이스를 구성하여 따로 뺌
    public void move();
}
