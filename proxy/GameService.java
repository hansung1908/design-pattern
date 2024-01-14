package proxy;

// 인터페이스로 구현하여 보다 유연하게 코드를 변경
public interface GameService {
    void startGame() throws InterruptedException;
}
