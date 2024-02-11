package 개인연습;

import java.util.Scanner;

public class 개인연습4 {
    public static void main(String[] args) {
        //문제: 사용자로부터 두 가지의 정수를 입력받아 두 수의 합이 짝수인지 홀수인지 판별하는 프로그램을 작성하세요.

        Scanner scanner = new Scanner(System.in);
        System.out.println("A : ");
        int A = scanner.nextInt();
        System.out.println("B : ");
        int B = scanner.nextInt();

        int C = (A + B) / 2;

        if (A + B / 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }




    }
}
