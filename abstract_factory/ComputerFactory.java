package abstract_factory;

// 제조사 별로 컴퓨터를 구성하기 위해 캡슐화
public interface ComputerFactory {
    public Keyboard createKeyboard();
    public Mouse createMouse();
}

//public class ComputerFactory {
//    public void createComputer(String type){
//        KeyboardFactory keyboardFactory = new KeyboardFactory();
//        MouseFactory mouseFactory = new MouseFactory();
//
//        keyboardFactory.createKeyboard(type);
//        mouseFactory.createMouse(type);
//        System.out.println("--- " + type + " 컴퓨터 완성 ---");
//    }
//}
