package decorator;

public class Client {
    public static void main(String args[]){
//        // 각 종류의 샌드위치를 일일이 클래스로 정의하면 너무 많은 클래스를 생성해야 함
//        Sandwich sandwich = new Sandwich();
//        sandwich.make();
//        System.out.println("-------");
//
//        SandwichWithLettuce sandwichWithLettuce = new SandwichWithLettuce();
//        sandwichWithLettuce.make();
//        System.out.println("-------");
//
//        SandwichWithPickle sandwichWithPickle = new SandwichWithPickle();
//        sandwichWithPickle.make();

        // 양상추 샌드위치
        Sandwich sandwichWithLettuce = new LettuceDecorator(new Bread());
        sandwichWithLettuce.make();
        System.out.println("-------");

        // 양상추+피클 샌드위치
        Sandwich sandwichWithLettuceAndPickle = new PickleDecorator(new LettuceDecorator(new Bread()));
        sandwichWithLettuceAndPickle.make();
    }
}
