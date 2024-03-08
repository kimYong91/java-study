package quiz.quiz3.quiz1;

public class PaymentProcessor{
    public void payed (Payment[] payments, int amount){

        for (Payment payment : payments) {
            payment.pay(amount);
        }
    }

}
