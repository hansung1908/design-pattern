package proxy;

public class GameServiceProxy implements GameService{

    private GameService gameService;

//    // 초기화 지연을 위한 삭제
//    public GameServiceProxy(GameService gameService) {
//        this.gameService = gameService;
//    }

    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();

        // 이런식의 lazy 로딩도 가능 (초기화 지연기능)
        if(this.gameService == null) {
            this.gameService = new DefaultGameService();
        }

        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
