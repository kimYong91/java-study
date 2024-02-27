package solid.ocp.after;


public class PaymentProcessor {
    // 클라이언트 코드는 새로운 결제 방법이 등장해도 변경되지 않는다. * NaverPayPayment 추가했음에도 실행코드는 변경 없음
    // 코드 수정에 닫혀있다.
    public void processPayment(Payment payment) {
        payment.processPayment();
    }
}