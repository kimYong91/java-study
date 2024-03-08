package quiz.quiz3.quiz3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 1을 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("숫자 2를 입력하세요: ");
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println("결과 : " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (InputMismatchException e) {
            System.out.println("유효한 숫자를 입력해주세요");
        }

    }
}
