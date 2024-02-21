package static0.ex;

public class BankAccount {

    private String accountId;
    private long balance;


    public void deposit(long amount) {
        balance += amount;
    }
    public void withdraw(long amount) {
        if (amount > balance){
            System.out.println("출금할 수 없습니다.");
            return;
        }
        balance -= amount;
    }

    public void printAccount() {
        System.out.println("계좌" + accountId + ", 잔고 : " + balance);
    }




}
