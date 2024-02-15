package method;

public class Method6 {
    public static void main(String[] args) {
        // 자바에서 메소드는 변수의 값을 복사해서 대입한다.
        int number = 5;
        System.out.println("메소드 호출 전 : " + number); // 3
        number = multiply2(number);         // 메서드 리턴 값을 기존 메소드의 number 에 대입
        System.out.println("메소드 호출 후 : " + number); // 6 (x) => 3
    }

    public static int multiply2(int number) {
        // 메인 메소드의 number 와 multiply2 메소드의 number 는 다른 값이다.
        // 메인 메소드의 number 를 복사한 값이다.
        number = number * 2;
        return number;

    }
}