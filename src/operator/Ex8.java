package operator;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 사용자로부터 두 정수를 입력받아, 두 정수 중 큰 값을 출력하는 프로그램을 작성하세요.
        // 이때, 조건 연산자(삼항 연산자)를 사용하여 구현하세요.

        // Hint
        Scanner scanner = new Scanner(System.in);
        System.out.print("A : ");
        int A = scanner.nextInt();
        System.out.print("B : ");
        int B = scanner.nextInt();
        scanner.close();


        String grade = (A < B) ? "A" : "B"; // int result => 숫자만 입력 가능
        System.out.println("grade = " + grade);


    }
}
