package class0.ex;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        /*
        문제: 간단한 은행 계좌 관리 시스템 설계
        목표: 은행 계좌의 기본적인 기능을 제공하는 간단한 계좌 관리 시스템을 설계하세요. 계좌의 생성, 입금, 출금, 잔액 조회 기능을 구현합니다.

        1단계: 계좌 클래스(BankAccount) 정의
        속성: 계좌번호(accountNumber), 소유자 이름(ownerName), 잔액(balance)
        기능: * 메서드
        입금(deposit): 잔액에 특정 금액을 추가합니다.
        출금(withdraw): 잔액에서 특정 금액을 차감합니다. 잔액이 출금하려는 금액보다 적을 경우 출금을 할 수 없습니다.
        잔액 조회(getBalance): 현재 잔액을 출력합니다.

        2단계: 메인 메서드에서 해당 틀래스를 생성하고 사용해보세요
         */
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("계좌 생성");
        System.out.print("계좌번호 : ");
        bankAccount.accountNumber = scanner.next();
        System.out.print("이름 : ");
        bankAccount.ownerName = scanner.next();

        System.out.println("계좌 번호: " + bankAccount.accountNumber + "\n" + "이름 : " + bankAccount.ownerName + "\n" + "잔액 : " + bankAccount.balance);
        String newAccount = scanner.next();



    }

}
