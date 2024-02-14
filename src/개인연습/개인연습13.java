package 개인연습;

import java.util.Scanner;

public class 개인연습13 {
    //    문제: 사용자로부터 양의 정수를 입력받아, 입력한 정수부터 1까지의 모든 수의 곱을 계산하는 프로그램을 작성하세요.
    //    조건:
    //    1. 입력된 정수부터 1까지의 모든 수의 곱을 계산합니다.
    //    2. 입력된 정수는 양의 정수라고 가정합니다.
    //    3. 계산 결과는 최종적으로 화면에 출력합니다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("양의 정수 : ");
        int num = scanner.nextInt();
        int factorial = 1;

        while (num > 1) {
            factorial *= num;
            num--;
        }
        System.out.println("합계 : " + factorial);


    }
}
