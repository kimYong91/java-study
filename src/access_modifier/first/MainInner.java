package access_modifier.first;

public class MainInner {

    public static void main(String[] args) {
        Data data = new Data();

        // 외부 + 다른 패키지 접근시 private, default 접근 불가
        data.publicData = 1000;
        // data.defaultData = 1000;
        // data.privateData         필드

        data.publicMethod();
        // data.defaultMethod();
        // data.privateMethod()        메서드
    }

}
