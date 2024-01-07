package observer;

import java.util.ArrayList;
import java.util.List;

// 옵저버를 관리하는 기능을 클래스로 구현
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    // 옵저버에 추가
    public void attach(Observer observer){
        observers.add(observer);
    }

    // 옵저버에서 제거
    public void detach(Observer observer){
        observers.remove(observer);
    }

    // 옵저버들에게 알림
    public void notifyObservers(String msg){
        for (Observer o:observers) {
            o.receive(msg);
        }
    }
}