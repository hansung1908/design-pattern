package factory;

public class Client {
    public static void main(String args[]){
        ClassA classA = new ClassA();
        classA.createType("A");
        classA.createType("C");
    }
}
