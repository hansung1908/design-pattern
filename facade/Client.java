package facade;

public class Client {
    public static void main(String[] args) {
        // 컴퓨터(파사드)를 통해 컴퓨터 내부의 부풐(CPU, HDD) 등을 접근
        Computer computer = new Computer();
        computer.startComputer();
    }
}
