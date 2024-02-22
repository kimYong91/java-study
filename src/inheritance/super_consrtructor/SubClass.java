package inheritance.super_consrtructor;

public class SubClass extends SuperClass {
    // 상속 받으면, 생성자의 첫줄에 super(..)를 사용해서 부모 클래스 생성자를 호출해야 한다.
    // 매개변수가 없는 생선자(기본 생성자)의 경우 super()의 생략이 가능하다.
    public SubClass() {
       // super(); 부모 클래스 생성자 호출 (생략 가능)
        super(100,"abc"); // 부모 클래스 생성자보면 되기에 부모 클래스 생성자에 표시된다.
        System.out.println("자식 클래스 생성자");
    }
}
