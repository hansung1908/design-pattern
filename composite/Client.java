package composite;

public class Client {

    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    // 클라이언트가 너무 많은 정보를 가지고 있음 -> 기능 수정시 불가피한 코드 수정 필요
//    private void printPrice(Item item) {
//        System.out.println(item.getPrice());
//    }
//
//    private void printPrice(Bag bag) {
//        System.out.println(bag.getItems().stream().mapToInt(Item::getPrice).sum());
//    }

    // 클라이언트는 가장 상위만 설정 -> 하위 로직은 감춰짐
    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
