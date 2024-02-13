package 개인연습;

import java.util.Scanner;

public class 개인연습3 {
    // 산술 연산자
    // 두 개의 정수 a와 b를 사용자로부터 입력받습니다.
    // 이 두 수에 대해 더하기, 빼기, 곱하기, 나누기, 나머지 연산을 수행하고
    // 결과를 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("B : ");
        int b = scanner.nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a % b = " + (a % b));

        if (b == 0) {
            System.out.println("0은 나누어지지 않습니다.");
        } else {
            System.out.println("a / b = " + (a / b));
        }
    }

}
