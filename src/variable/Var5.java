package variable;

public class Var5 {
    public static void main(String[] args) {
        /* 변수 이름 짓는 규칙
        - 변수 이름은 숫자로 시작할 수 없다. 하지만 숫자를 포함하는 것은 가능하다.
        - 공백이 들어갈 수 없다. 대신 CamelCase (난타등 표법) 공백 이후 등장하는 단어는 대문자로 변환
        - 예약어를 사용할 수 없다. (public, int, void, class.....)
        - 변수 이름에는 영문자, 숫자, $, _를 사용한다.
         */
        int abc;
        int orderCount;

        /*
        변수 명명 관례
        - 자바에서 클래스의 이름의 첫글자는 대문자로 시작한다.
        - 클래스를 제외한 나머지는 모두 첫글자를 소문자로 시작한다.
        - 예외
            - 상수는 모두 대문자를 사용하고 언더바(_)로 구분
                -USER_LIMIT. PT
            -  패키지 이름은 모두 소준자를 사용한다.
         */

        /*
        - 변수 이름은 의미를 명확하게 전달해야 한다.
        - 용도를 설명할 수 있어야 한다.
         */
        int a; // 단순 예제 시에만 사용

        int gustNumber; //용도를 명활하게 설명 가능
        int orderCount;
    }
}
