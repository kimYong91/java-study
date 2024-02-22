package inheritance.super_consrtructor;

public class SuperClass extends GrandClass {

    // 기본 생성자는 매개변수가 있는 생선자 정의 시 생략된다.
    public SuperClass(int value) {
        this(value, null);      // this를 통해서 다른 생성자가 호출될 때, 그 생성자에서 super()가 있으면 super()생략 가능하다.
        // super(); // 할아버지 클래스 생성자 호출 (생략 가능) * 첫줄에만 써야함
        System.out.println("부모 클래스 생성자");
    }

    // 생성자 오버로딩 overloading
    public SuperClass(int value, String str) {
        super(); // 매개변수 없는 부모 생성자 (생략 가능)
        System.out.println("아버지 생성자 " + value + str);
    }

}
