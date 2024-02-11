package 개인연습;

import java.util.Scanner;

public class 개인연습6 {
    public static void main(String[] args) {
        //사용자로부터 세 개의 정수를 입력받아, 이 세 수 중에서 가장 작은 값을 찾아 출력하는 프로그램을 작성하세요.
        //힌트: 세 개의 수 중에서 가장 작은 값을 찾기 위해서는 각각의 수를 비교하여 가장 작은 값을 계속해서 업데이트해야 합니다.

        Scanner scanner = new Scanner(System.in);
        System.out.print("A : ");
        double A = scanner.nextDouble();
        System.out.print("B : ");
        double B = scanner.nextDouble();
        System.out.print("C : ");
        double C = scanner.nextDouble();

        double small;

        if (A < B) {
            small = A;
        } else {
            small = B;
        } if (small > C) {
            System.out.println("SMALL : C " + C);
        } else if (small < C && small < B) {
            System.out.println("SMALL : A " + A);
        } else if (small < C && small < A) {
            System.out.println("SMALL : B " + B);
        } else if (A == B && B == C) {
            System.out.println("동일한 값 입니다.");
        }
    }
}