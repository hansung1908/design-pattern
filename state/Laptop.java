package state;

public class Laptop {
//    // 상태를 클래스로 표현하기에 필요 없음
//    public static String ON = "on";
//    public static String OFF = "off";
//    public static String SAVING = "saving";
//    private String powerState = "";

    private PowerState powerState;

    public Laptop(){
//        setPowerState(Laptop.OFF);
        this.powerState = new Off();
    }

    public void setPowerState(PowerState powerState){
        this.powerState = powerState;
    }

    public void powerPush(){
//        // 상태가 여러개 있다면 분기하는 코드는 굉장히 길어질 것이기 때문에, 상태에 따라 하고자 하는 행위를 파악하기 어려움
//        if ("on".equals(this.powerState)) {
//            System.out.println("전원 off");
//        }
//        else if ("saving".equals(this.powerState)){
//            System.out.println("전원 on");
//        }
//        else {
//            System.out.println("절전 모드");
//        }

        // 분기 코드가 사라지고 powerpush 메소드만 호출
        powerState.powerPush();
    }
}
