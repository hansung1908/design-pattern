package factory;

public class ClassA {
//    public Type createType(String type){
//        Type returnType = null;
//        switch (type){
//            case "A":
//                returnType = new TypeA();
//                break;
//
//            case "B":
//                returnType = new TypeB();
//                break;
//
//            case "C":
//                returnType = new TypeC();
//                break;
//        }
//
//        return returnType;
//    }

    // 분기처리 파트는 팩토리 클래스로 빼고 팩토리 객체 생성
    public Type createType(String type){
        TypeFactory factory = new TypeFactory();
        Type returnType = factory.createType(type);

        return returnType;
    }
}
