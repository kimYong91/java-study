package exception.ex.ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        try {
            InvalidAgeException invalidAgeException = new InvalidAgeException();
            invalidAgeException.adult(age);
            //invalidAgeException.adult(age); 이거에 합당한 에러가 아닐시 바로 다음 코드가 실행됨
            System.out.println("접근이 허용되었습니다.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close(); // 리소스 종료
        }
    }
}
/*
연습문제 2: 사용자 정의 예외와 예외 떠넘기기

요구사항:
InvalidAgeException이라는 사용자 정의 예외를 생성합니다.
사용자로부터 나이를 입력받는 프로그램을 작성합니다.
나이가 18세 미만일 경우, InvalidAgeException을 발생시키고
"미성년자는 접근할 수 없습니다."라고 출력합니다.
이 예외는 메소드를 호출한 곳에서 처리해야 합니다(throws 사용).

예상 실행 결과
===
나이를 입력하세요: 16
미성년자는 접근할 수 없습니다.

나이를 입력하세요: 20
접근이 허용되었습니다.
 */