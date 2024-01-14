package proxy;

public class Client {
    public static void main(String[] args) throws InterruptedException {
//        GameService gameService = new GameServiceProxy(new DefaultGameService());

        // lazy 로딩으로 초기화를 메서드 실행시 가능
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
