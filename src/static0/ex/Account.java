package static0.ex;

public class Account {
    /*
    필드는
    accountNumber 고유한 계좌번호
    ownerName 소유자 이름
    balance 잔액
    interestRate 불변 고정 이자

    // 생성자 : 3가지 필드 사용

    // 메서드 : 필드 내용을 출력하는 정보 출력 메서드
     */
    private final String accountNumber;
    private final String ownerName;
    private long balance;
    static final double INTEREST_RATE = 0.04;

    public Account (String accountNumber, String ownerName, long balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void printAccount () {
        System.out.println("ownerName = " + ownerName);
        System.out.println("accountNumber = " + accountNumber);
        System.out.println("INTEREST_RATE = " + INTEREST_RATE);
        System.out.println("balance = " + balance);
    }




}
