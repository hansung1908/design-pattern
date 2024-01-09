package abstract_factory;

// 구성품을 기준으로 팩토리를 구성하는 것이 아닌 제조사를 기준으로 팩토리를 구성
public class SamsungComputerFactory implements ComputerFactory {
    public SamsungKeyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    public SamsungMouse createMouse() {
        return new SamsungMouse();
    }
}
