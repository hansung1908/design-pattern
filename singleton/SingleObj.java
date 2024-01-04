package singleton;

public class SingleObj {
    private static SingleObj singleObj = null;

    // 외부에서 직접 생성하지 못하도록 private 선언
    private SingleObj(){ }

    // 오직 1개의 객체만 생성
    // static 선언을 통해 해당 객체를 인스턴스 생존주기를 넘어서도 계속 사용
    public static SingleObj getInstance(){
        if( singleObj == null ){
            singleObj = new SingleObj();
        }

        return singleObj;
    }
}
