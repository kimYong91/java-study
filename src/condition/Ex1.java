package condition;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // 환율 계산하기
        // 달러 환율 1327원
        // 달러를 0원 입금 받으면 => "환전할 금액이 없습니다."
        // 양수일 때 환전금액은 00000원 입니다.
        // 음수일 때 "잘못 입력하였습니다."

        Scanner scanner = new Scanner(System.in);
        System.out.print("달러 입금 : ");
        int dollar = scanner.nextInt();
        scanner.close();

        // 1dollar = 1327won
        // 1달러를 입금하면 "환전금액 1327원" 이라고 나와야함
        // 2달러는 *2씩 "원 입금"
        // 0달러는 "잘못 입력"

        if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else if (dollar <= 0) {
            System.out.println("잘못 입력하였습니다.");
        } else {
            System.out.println("환전 금액 : " + (dollar * 1327) + "원 입니다.");
        }

    }
}

