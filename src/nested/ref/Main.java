package nested.ref;

public class Main {
    public static void main(String[] args) {
        //바깥쪽 인스턴스 객체 생성
        OuterClass outerClass = new OuterClass();       // new OuterClass(); 이 코드만 쓰고 Ctrl + Alt + v 를 하면 자동 완성
        // 안쪽 인스턴스 객체 생서
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        // 안쪽에서 호출 테스트
        innerClass.innerMethod();
        innerClass.call();
    }
}
