package observer;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[]){
        User user = new User();

//        List<Room> rooms = new ArrayList<Room>();

        // 유저로부터 room에 대한 의존성을 제거
        ChatRoom chatRoom = new ChatRoom("채팅방");
        GameRoom gameRoom = new GameRoom("게임방");
        DevRoom devRoom = new DevRoom("개발방");

//        rooms.add(new ChatRoom("채팅방"));
//        rooms.add(new GameRoom("게임방"));
//        rooms.add(new DevRoom("개발방"));
//
//        user.setRoom(rooms);
//
//        String msg = "안녕하세요~";
//        user.talk(msg);

        // 객체지향적으로 room을 다루는 코드 구현
        user.attach(chatRoom);
        user.attach(gameRoom);
        user.attach(devRoom);

        String msg = "안녕하세요~";
        user.notifyObservers(msg);

        user.detach(chatRoom);
        msg = "Hi~";
        user.notifyObservers(msg);
    }
}
