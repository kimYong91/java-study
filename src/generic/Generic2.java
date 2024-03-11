package generic;

public class Generic2 {
    // 제네릭 : 결정되지 않은 타입을 파라미터로 처리하고, 실제 사용할 때 파라미터를 구체적인 타입으로 대체하는 기능
    static class Box<T> {
        T content;

        public T getContent() {
            return content;
        }

    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<String>();
        stringBox.content = "문자열";
        String strContent = stringBox.content;
        strContent.length();    // 캐스팅 필요없음

        // Box ㅅ
        // 우측 항에서 타입은 추론 가능하기에 생략 가능
        Box<Integer> integerBox = new Box<>();
        // integerBox.countent = "문자열";
        integerBox.content = 10;
        Integer intContent = integerBox.getContent();
        intContent.equals(100);
    }
}
