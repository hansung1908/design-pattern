package singleton;

public class Client {
    public static void main(String args[]){
        // 여러 번 인스턴스를 생성해도 주소가 같은 하나의 객체를 호출
        for( int i = 0; i < 5; i++ ){
            SingleObj obj = SingleObj.getInstance();
            System.out.println(obj.toString());
        }
    }
}
