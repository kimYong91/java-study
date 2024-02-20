package access_modifier.first;

public class A {
    // 내부에서 접근
    A publicA = new A(100);             // public 내부 접근 가능
    A defaultA = new A();                 // default 내부 접근 가능
    A privateA = new A("private");     // private 내부 접근 가능

    // 생성자가 접근제한자에 따라 3가지 정의
    // public
    public A(int a) {
        System.out.println("public A 생성자 ");
    }
    // default 는 아무것도 안 붙히면 default이다
    A() {
        System.out.println("default 클래스 A 생성");
    }
    // private
    private A(String a) {
        System.out.println("priviate A 생성자");
    }


}