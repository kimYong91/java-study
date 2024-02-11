package 개인연습;

import java.util.Scanner;

public class 개인연습9 {
    public static void main(String[] args) {
        //사용자로부터 두 개의 정수를 입력받아, 두 수 중에서 더 큰 값을 출력하는 프로그램을 작성하세요.

        //힌트: 삼항 연산자를 사용하여 두 수를 비교하고, 더 큰 값을 선택합니다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("A : ");
        int A = scanner.nextInt();
        System.out.print("B : ");
        int B = scanner.nextInt();

        System.out.println("WIN : " + ((A > B) ? "A" : "B"));
        //int max = Math.max(A, B);
        //System.out.println("WIN : " + max);


    }
}
