package access_modifier.com.bank.system;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        double balance = account.getBalance();
        System.out.println("잔액 : " + balance);
        account.deposit(1000);
        double won = account.deposit(1000);

        System.out.println(won + "원 입금하였습니다.");
        System.out.println("잔액 : " + account.getBalance());


        account.withdraw(900);
        System.out.println("출금하였습니다.");
        System.out.println("잔액 : " + account.getBalance());
    }

}
