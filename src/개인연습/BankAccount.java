package 개인연습;

import java.util.Scanner;

public class BankAccount {
    /*
        속성: 계좌번호(accountNumber), 소유자 이름(ownerName), 잔액(balance)
            기능: * 메서드
            입금(deposit): 잔액에 특정 금액을 추가합니다.
            출금(withdraw): 잔액에서 특정 금액을 차감합니다. 잔액이 출금하려는 금액보다 적을 경우 출금을 할 수 없습니다.
            잔액 조회(getBalance): 현재 잔액을 출력합니다.

            내가 원하는 기능
            메인
            이름 입력하면 계죄번호 만드는 칸 나오고 입력하면 만들어진 계좌 나오게 하는것


            2. 만들어진 계좌      accountCheck
            이름 : 홍길동, 계죄번호 : 123..., 잔액 0원

            3. 원하시는 메뉴를 선택하세요 : 1
                1. 입금         deposit
                2. 출금         withdraw
                3. 잔액 조회     balanceCheck
                입금 하실 금액을 적어주세요
                10000
            5. 10000원을 입금 하셨습니다.
            6. 원하시는 메뉴를 선택하세요 :
                1. 입금
                2. 출금
                3. 잔액 조회
         */
    static private String accountNumber;       // 계죄번호
    static private String ownerName;           // 소유자 이름
    static private long balance;                // 잔액
    static private long num;                   // 입금, 출금 금액



    public void accountCreate () {
        int first = (int) ((Math.random() * 999) + 100);
        int second = (int) ((Math.random() * 99999) + 10000);
        int third = (int) ((Math.random() * 99) + 10);
        int fourth = (int) ((Math.random() * 999) + 100);

        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        ownerName = scanner.next();
        System.out.println("이름 : " + ownerName + ", 계좌 : " + first + "-" + second + "-" + third + "-" + fourth + ", 잔액 : " + balance + "원");
    }

    //3. 원하시는 서비스를 선택하세요 : 1
    //            1. 입금         deposit
    //            2. 출금         withdraw
    //            3. 잔액 조회     balanceCheck
    //            4. 종료
    //            입금 하실 금액을 적어주세요
    //            10000

    public void printMenu () {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액 조회");
            System.out.println("4. 종료");
            System.out.print("원하시는 서비스를 선택하세요 : ");
            long num = scanner.nextInt();
            long resurt = 0;

            if (num == 1) {
                System.out.println("입금 하실 금액을 적어주세요");
                this.num = scanner.nextLong();
                deposit(this.num);
                this.num = resurt;
                continue;
            } else if (num == 2) {
                System.out.println("출금 하실 금액을 적어주세요");
                this.num = scanner.nextLong();
                withdraw(this.num);
                this.num = resurt;
                continue;
            } else if (num == 3) {
                balanceCheck();
                continue;
            } else if (num == 4) {
                System.out.println("종료합니다.");
                break;
            }
        }
    }
    static long deposit (long num) {
        System.out.println(num + "원 입금 하셨습니다.");
        balance += num;
        return balance;
    }
    static long withdraw (long num) {

        if (num > balance){
            System.out.println("금액이 부족합니다. 출금 할 수 없습니다.");
        } else {
            System.out.println(num + "원 출금 하셨습니다.");
        }
        balance -= num;
        return balance;
    }
    static void balanceCheck () {
        System.out.println("잔액 : " + balance + "원 입니다.");
    }

}
