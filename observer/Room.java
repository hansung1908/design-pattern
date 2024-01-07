package observer;

// 다양한 채팅방을 캡슐화하기 위한 room 클래스
public class Room {
    public String roomName;

    public void receive(String msg){
        System.out.println(this.roomName + "에서 메시지를 받음 : " + msg);
    }
}
