package solid.dip.after;

// DIP 적용 전
public class CreditCard implements Payment {
    public void processPayment(double amount) {
        // 신용카드 결제 처리...
    }
}