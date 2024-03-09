package quiz.quiz3.quiz1;

public class BankTransfer implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("은행 이체로 " + amount + "원 결제되었습니다.");


    }
}
