package proxy;

public class DefaultGameService implements GameService{

    @Override
    public void startGame() throws InterruptedException {
        // 비즈니스 로직을 여기에 구현
        Thread.sleep(1000);
    }
}
