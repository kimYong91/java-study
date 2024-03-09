package quiz.quiz3.quiz1;

public class PaymentProcessor {
    public void Process (Payment[] payments, int amount){
        for (Payment payment : payments) {
            payment.pay(amount);
        }
    }
}
