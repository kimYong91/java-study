package access_modifier.com.bank.system;

public class Account {

    //필드:
    //balance; 계좌의 잔액. 외부 접근 금지
    private double balance;

    // 잔액 조회,  기능: 현재 잔액을 반환
    public double getBalance() {
        return balance;
    }

    // 입금, 기능 : 잔액에 금액을 추가
    public void deposit(double amount) {
        balance += amount;
    }

    // 출금. 잔액보다 많은 금액을 출금하려고 하면 출금을 거부해야 함.
    // 잔액이 출금할 금액보다 크거나 같을 경우에만 출금 처리. 그렇지 않으면 경고 메시지 출력
    public void withdraw(double amount) {
        // 제약 조건
        if (amount > balance){
            System.out.println("잔액이 부족합니다.");
            return; // 실행하지 않고 탈출하라
        }
            amount -= balance;
        }
    }
