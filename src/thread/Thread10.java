package thread;

public class Thread10 {
    static int count = 0;

    // 동기화를 위한 자물쇠 객체
    static final Object lock = new Object();

    // 동기화 synchronized
    // 해당 블럭에 대해 한 번에 하나의 스레드만 접근할 수 있도록 하여
    // 경쟁상태(동시진행)를 예방 할 수 있다. (데이터 손실, 오류를 막을 수 있음)
    public static void main(String[] args) {
        Thread incrementer = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                // 동기화 블럭
                synchronized (lock) {
                    count++;
                }
            }

        });

        Thread decrementer = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (lock) {
                    count--;
                }
            }

        });

        incrementer.start();
        decrementer.start();

        try {
            Thread.sleep(1000);
            System.out.println("count : " + count);
        } catch (InterruptedException e) {
        }
    }
}
