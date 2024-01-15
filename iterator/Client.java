package iterator;

import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Board board = new Board();

        // 시간 차를 두기 위해 sleep 사용
        board.addPost("디자인 패턴");
        Thread.sleep(1000);
        board.addPost("크게 생성 패턴, 행동 패턴, 구조 패턴 3가지로 분류");
        Thread.sleep(1000);
        board.addPost("그 중에서 실무에서 많이 쓰이는 14가지 학습중");

        List<Post> posts = board.getPosts();

        // TODO iterator 순회 내부가 list
        // iterator를 사용하면 보드 내부에 어떤 타입이 존재하는지 알지 않아도 됨
        Iterator<Post> iterator = posts.iterator();
        System.out.println(iterator.getClass());

//        // TODO 들어간 순서대로 순회하기 -> 클라이언트가 보드가 list의 구조라는 것을 알고 있어야 하는 순회
//        // -> list 타입이 아닌 다른 무엇인가로 변경된다면 클라이언트 코드도 변경되어야 함
//        for(int i = 0; i < posts.size(); i++) {
//            Post post = posts.get(i);
//            System.out.println(post.getTitle());
//        }

        // TODO 올린 순서대로 순회
        // board 자체에서 순회하기 위한 iterator 제공
        Iterator<Post> PostIterator = board.getDefaultIterator();
        while(PostIterator.hasNext()) {
            System.out.println(PostIterator.next().getTitle());
        }

//        // TODO 가장 최신 글 먼저 순회하기
//        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));

        // board에서 제공하는 iterator를 통해 최신 글부터 순회
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while(recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getTitle());
        }
    }
}
