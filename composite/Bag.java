package composite;

import java.util.LinkedList;
import java.util.List;

public class Bag implements Component{

//    private List<Item> items;

    // 트리구조를 만들기 위한 리스트 설정
    private List<Component> components = new LinkedList<>();

//    public void add(Item item) {
//        items.add(item);
//    }

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }

    // @Getter
//    public List<Item> getItems() {
//        return items;
//    }

    public List<Component> getComponents() {
        return components;
    }
}
