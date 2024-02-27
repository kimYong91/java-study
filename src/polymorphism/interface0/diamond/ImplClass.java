package polymorphism.interface0.diamond;

public class ImplClass implements First, Second{


    // first 인터페이스에서 가져온 메서드
    @Override
    public void firstMethod() {
        System.out.println("first");
    }
    // second 인터페이스에서 가져온 메서드
    @Override
    public void secondMethod() {
        System.out.println("second");
    }
    // first, second 양쪽 인터페이스에서 가져온 메서드 (메서드 본문은 구현 클래스에서 구현 -> 다이아몬드 문제가 발생하지 않음)
    @Override
    public void commonMethod() {
        System.out.println("first, second 공통 메서드");
    }
}
