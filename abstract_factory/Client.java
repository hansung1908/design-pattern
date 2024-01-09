package abstract_factory;

public class Client {
    public static void main(String args[]){
//        ComputerFactory computerFactory = new ComputerFactory();
//        computerFactory.createComputer("LG");

        // 제조사별 컴퓨터를 생성
        FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
        factoryOfComputerFactory.createComputer("LG");
    }
}