package quiz.quiz1;

import java.util.Scanner;

public class Quiz1 {
            /*
        조건문 : 달러를 원으로 환전하는 간단한 프로그램을 만들어주세요.
        - Scanner 클래스를 사용하여 사용자 입력을 받습니다.
                - if 문을 사용하여 분기를 나눕니다.
        1. 달러를 0원 입금 받으면 => "환전할 금액이 없습니다."
        2. 양수일 때 환전금액은 "00000원 입니다."
        3. 음수일 때 "잘못 입력하셨습니다"
        1300
         */
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("입금할 달러 : ");
                int dollar = scanner.nextInt();



                if (0 == dollar) {
                    System.out.println("환전할 금액이 없습니다.");
                } else if (0 <= dollar) {
                    int resurt = dollar * 1300;
                    System.out.println( resurt + "원 입니다.");
                } else {
                    System.out.println("잘못 입력하셨습니다.");
                }
            }

}
