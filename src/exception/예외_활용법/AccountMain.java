package exception.예외_활용법;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(1000);
        System.out.println("예금액 : " + account.getBalance());

        // 떠넘겨진 예외(체크 예외)를 처리
        try {
            account.withdraw(5000);
        } catch (InsufficientException e) {
            // 예외의 메시지를 가져올 수 있다.
            System.out.println(e.getMessage());
        }
    }
}