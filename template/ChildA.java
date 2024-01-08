package template;

public class ChildA extends Parent{
    @Override
    public void hook(){
        System.out.println("Child A 에서 hook 구현");
    }
}
