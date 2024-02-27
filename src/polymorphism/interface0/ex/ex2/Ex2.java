package polymorphism.interface0.ex.ex2;

public class Ex2 {
    public static void main(String[] args) {
        Payment[] payments = {new CreditCard(), new BankTransfer(), new MobilePay()};

        for (Payment payment : payments) {
            payment.payment(10000);
        }


    }

}
