package thread.ex;

public class Ex6_풀이 {
    public static void main(String[] args) {
        Restaurant1 restaurant = new Restaurant1();
        // 요리사 스레드
        new Thread(() -> {
            while (true) {
                restaurant.prepareOrder();
            }
        }).start();
        // 고객 스레드
        new Thread(() -> {
            while (true) {
                restaurant.placeOrder();
            }
        }).start();

    }
}

class Restaurant1 {
    boolean isOrdered = false;

    public synchronized void placeOrder() {
        // if문 대신으로 조건 검사 :
        try {
            while (isOrdered) {  // 주문이 처리되기 전까지
                wait(); // 대기
            }
            System.out.println("고객 : 주문을 합니다.");
            isOrdered = true;   // 주문 상태 업데이트
            notifyAll();        // 다른 스레드(요리사)에게 알림
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public synchronized void prepareOrder() {
        try {
            // 주문이 올때까지 대기
            while (!isOrdered) {
                wait();
            }
            System.out.println("요리사 : 주문을 받아, 음식을 준비합니다.");
            Thread.sleep(2000);
            System.out.println("요리사 : 음식이 준비되어, 서빙합니다.");
            isOrdered = false;
            notifyAll();    // 다른 스레드(고객)에 알림

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}