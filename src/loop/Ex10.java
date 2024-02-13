package loop;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // 은행 앱
        /*
        -----------------------------------
        1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        -----------------------------------
        선택>
        1. 선택
        예금액 > 10000     => 잔고에 10000원 입금
        2. 선택
        출금액 > 1000      => 잔고에서 1000원 출금
        3. 선택
        잔고액 > 9000      => 잔고액 확인가능
        4. 선택
        "프로그램이 종료됩니다."
         */
//        System.out.println("-----------------------------------");
//        System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
//        System.out.println("-----------------------------------");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("선택 : ");
//        int num = scanner.nextInt();
//
//        do {
//            if (num == 1) {
//                System.out.println("예금 : ");
//                int num1 = scanner.nextInt();
//                break;
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        long balance = 0;

        while (isRun){
            System.out.println("-----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-----------------------------------");
            System.out.print("선택 : ");
            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.print("예금액> ");
                    long amount = scanner.nextLong();
                    balance += amount;      // 잔고에 금액을 추가
                    break;
                case 2:
                    System.out.print("출금액> ");
                    long money = scanner.nextLong();   // 잔고에 금액을 인출
                    if (money > balance) {
                        System.out.println("예금액 이상의 금액은 인출할 수 없습니다.");
                    }
                    balance -= money;
                    break;
                case 3:
                    System.out.println("잔고> " + balance);
                    break;
                case 4:     // 종료
                    isRun = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;

            }
        }
    }
}