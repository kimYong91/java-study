package 개인연습;

import java.util.Scanner;

public class 개인연습5 {
    //문제: 사용자로부터 세 개의 정수를 입력받아 그 중 최댓값을 출력하는 프로그램을 작성하세요.

    //힌트: 먼저 두 수를 비교하여 더 큰 수를 선택한 후, 그 수와 세 번째 수를 비교하여 최댓값을 찾습니다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A : ");
        double A = scanner.nextDouble();
        System.out.print("B : ");
        double B = scanner.nextDouble();
        System.out.print("C : ");
        double C = scanner.nextDouble();

        double win;

        if (A < B) {
            win = B;
        } else {
            win = A;
        }
        if (win < C) {
            System.out.println("WIN : " + C);
        } else if (win > B && win > C) {
            System.out.println("WIN : " + A);
        } else if (win > A && win > C) {
            System.out.println("WIN : " + B);
        } else if (A == B && A == C) {
            System.out.println("동일한 값입니다.");
        }
    }
}