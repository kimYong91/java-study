package polymorphism.interface0.ex.ex2;

public class Ex2 {
    public static void main(String[] args) {
        Payment[] payments = {new CreditCard(), new BankTransfer(), new MobilePay()};

        for (Payment payment : payments) {
            payment.pay(10000);
        }

        System.out.println("===========");


        PaymentProcessor processor = new PaymentProcessor();
        Payment[] payments1 = {new BankTransfer(), new CreditCard(), new MobilePay()};
        processor.process(payments1,10000);

        System.out.println("=============");





    }

}
