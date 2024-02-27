package solid.lsp.before;

public class Ostrich extends Bird {
    @Override
    void fly() {
        System.out.println("타조는 날지 못합니다.");
        // fly 를 하게 될 경우 런타임 오류를 일으킨다.
        throw new RuntimeException("타조는 못 납니다.");
    }
}