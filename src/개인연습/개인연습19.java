package 개인연습;

import 개인연습.ProductOrder;

import java.util.Scanner;

public class 개인연습19 {
    public static void main(String[] args) {
        /*
        예시
        학생수는 몇명인가요? 3
        점수를 입력하세요
        10
        20
        30
        >> 합계 : 60, 평균 : 20.0
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수 는 몇 명 인가요? ");
        int studentNumber = scanner.nextInt();
        System.out.println("점수를 입력하세요");

        int sum = 0;

        for (int i = 0; i < studentNumber; i++) {
            int studentScore = scanner.nextInt();

            sum += studentScore;
        }
        System.out.println(">> 합계 : " + sum + ", 평균 : " + (sum / studentNumber));

    }


}
