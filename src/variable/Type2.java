package variable;

public class Type2 {
    public static void main(String[] args) {
        // 자바의 ptimitive type (기본 타입) 8가지 **중요 표시
        boolean bool = false; //** true or false
        char c = 'c';

        // 정수 (범위를 넘으면 컴파일 에러 발생)
        byte b = -127; // -128 ~ 127 (2^8만큼의 데이터를 저장) =1 byte
        short s = 32767; // -31,768 ~ 32767 (2^16) =2 byte
        int i = 2147483647; // ** -214748648 ~214748647 (2^32) =4 byte
        long l = 9223372036854775807L; // ** (2^64) =8 byte

        //실수
        float f = 10.0f; // 데이터 정밀도 7자리 까지 (4byte = 32bit)
        double d = 10.0; // 정밀도 15자리 까지 (8byte = 64bit)

        // 리터럴(Literal) = > 문자 그대로
        // 소스코드에서 개발자가 직접 적은 고정된 프로그래밍 갋
        // 100, 10.0, 'A'. "안녕"
    }
}
