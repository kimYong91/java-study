package 개인연습;

import java.util.Scanner;

public class 개인연습10 {
    public static void main(String[] args) {
        //사용자로부터 세 개의 정수를 입력받아, 이 중에서 최댓값을 찾고 해당 값이 짝수인지 홀수인지 출력하는 프로그램을 작성하세요.

        //이 문제를 해결하기 위해 먼저 세 개의 정수 중에서 최댓값을 찾아야 합니다. 그런 다음 최댓값이 짝수인지 홀수인지를 판별하여 출력합니다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("A : ");
        int A = scanner.nextInt();
        System.out.print("B : ");
        int B = scanner.nextInt();
        System.out.print("C : ");
        int C = scanner.nextInt();

        int big;

        if (A < B) {
            big = B ;
        } else {
            big = A;
        } if (C > big) {
            big = C;
        }
        System.out.print("BIG : " + big);
        if (big / 2 == 0) {
            System.out.println(" 짝수 입니다.");
        } else {
            System.out.println(" 홀수 입니다.");
        }
    }
}
