package decorator;

// 토핑 추가를 위한 클래스 정의
// 샌드위치를 상속받음으로써 샌드위치에 토핑을 추가
public class ToppingDecorator extends Sandwich{
    private Sandwich sandwich;

    public ToppingDecorator(Sandwich sandwich){
        this.sandwich = sandwich;
    }

    public void make(){
        sandwich.make();
    }
}
