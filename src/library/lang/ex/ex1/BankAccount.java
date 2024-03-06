package library.lang.ex.ex1;

public class BankAccount {
    //은행 계좌 정보를 관리하는 BankAccount 클래스가 있다고 가정해 보겠습니다.
    // 계좌 번호와 소유자 이름, 현재 잔액을 포함하는 toString() 메소드를 오버라이드하여 구현할 수 있습니다.

    String accountNumber;
    String name;
    int num;

    public BankAccount(String accountNumber, String name, int num) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "계좌번호 : %s, 소유자 이름 : %s, 현재 잔액 : %d".formatted(accountNumber, name, num);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1321-132-654", "홍길동", 50000);
        System.out.println(bankAccount);
    }
}
