package thread.ex;

import java.util.Random;

public class CarRunnable implements Runnable{
    private String carName;

    public CarRunnable(String carName) {
        this.carName = carName;
    }

    @Override
    public void run() {
        System.out.println(carName + "이 출발했습니다.");
        for (int i = 100; i < 1000; i+=100) {
            System.out.println(carName + "이 " + i + "m를 달렸습니다.");
            try {
                Thread.sleep(new Random().nextInt(10,1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(carName + "가 결승선을 통과했습니다.");
    }
}
