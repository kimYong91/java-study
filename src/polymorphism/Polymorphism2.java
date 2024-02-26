package polymorphism;

public class Polymorphism2 {
    public static void main(String[] args) {
        // 업 캐스팅 : 자식 클래스 타입에서 부모 클래스 타입으로 변환
        // 명시적으로 캐스팅 작성 필요가 없다.
        // 항상 안전하다.
        SuperClass polymorph1 = new SubClass();

        // 다운 캐스팅 : 부모 클래스에서 자식 클래스타입으로 변환
        // 명시적으로 캐스팅을 작성해야한다. => 강제 타입 변환
        // 위험 가능성 : 런타임 오류(실행시켜야 알 수 있는 오류)인 ClassCastException 을 발생시킬 수 있다.
        // SubClass polymorph2 = (SubClass) new SuperClass(); // ClassCastException
        // polymorph2.subMethod(); // ClassCastException
    }
}
