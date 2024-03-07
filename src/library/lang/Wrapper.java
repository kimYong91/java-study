package library.lang;

public class Wrapper {
    // 레퍼 클래스 = 자바의 기본 타입 값을 갖는 객체를 생성(포장)하는 클래스
    // 기본 타입 : 메모리 주소에 값이 대입되고 성능이 좋다.
    // 기본 타입의 값은 외부에서 변경불가, 메서드를 사용할 수 없다.
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 4;
        long l = 8;
        float f = 4.0f;
        double d = 8.0;
        boolean bool = false;
        char c = 'A';
        // int i2 = null;       기본 데이터 타입은 null값을 가질 수 없다.
        // 컬랙션 프레임워크에 기본 데이터 값을 저장할 수 없다.

        // 포장 타입 (Wrapper Type)
        Byte aByte = 1;
        Short aShort = 2;
        Integer aInteger = 4;
        Long aLong = 8L;
        Float aFloat = 4.0f;
        Double aDouble = 8.0;
        Boolean aBoolean = true;
        Character aCharter = 'B';
        Integer integer = null;     // null값을 가질 수 있다.

        // integer. <- .으로 다양한 메서드에 접근 가능
        // 컬렉션 프레임워크에 값을 저장할 수 있다.

        // 기본 타입과 포장 타입을 변환하는 과정 : Boxing, UnBoxing

        // Boxing : 기본 타입 -> 포장 타입
        int intprimitive = 10;
        Integer intWrap = Integer.valueOf(intprimitive);

        // UnBoxing : 포장 타입 -> 기본 타입
        int unboxing = intWrap.intValue();

        // 자동 Boxing : 명시적으로 선언하지 않아도 자동으로 포장
        // 컴파일어에서 자동으로 처리
        Integer autoWrap = intprimitive;

        // 자동 UnBoxing : 자동 박싱과 같음
        int autoUnBoxing = autoWrap;

        // 자동 Boxing 과 UnBoxing 은 성능상으로 떨어질 수 있으니 반복문 등에서는 자제
        // 혼합하여 연산 가능
        int calculatedInt1 = intprimitive + intWrap;
        Integer calculatedInt2 = intprimitive + intWrap;

        // 유용한 메서드
        // 문자열로부터 레퍼 객체 반환
        Integer intValue = Integer.valueOf("1004");
        // 정수 자료형틀에 존재하는 기본타입 파싱 메서드
        int parsedInt = Integer.parseInt("100");
        long parsedLong = Long.parseLong("10000000000000000");
        double parsedDouble = Double.parseDouble("1000.1212");

        // 문자 자료형 메서드
        String str = "문자열Ab1 .";
        for (int j = 0; j < str.length(); j++) {
            Character ch = str.charAt(i);
            boolean letter = Character.isLetter(ch);
            boolean digit = Character.isDigit(ch);
            boolean spaceChar = Character.isSpaceChar(ch);
            boolean upperCase = Character.isUpperCase(ch);
            boolean lowerCase = Character.isLowerCase(ch);
        }
    }
}
