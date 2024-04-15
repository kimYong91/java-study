package quiz.quiz7;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Quiz3 {
    public static void main(String[] args) {
        List<Car> list = Arrays.asList(new Car(1), new Car(3), new Car(3));

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (Car car : list) {
            executorService.execute(car);
        }

        executorService.shutdown();
    }
}
class Car implements Runnable{
    int carName;

    public Car(int carName) {
        this.carName = carName;
    }

    @Override
    public void run() {
        try {
            System.out.println("차량"+carName+"이 출발했습니다.");
            for (int i = 1; i < 10; i++) {
                Thread.sleep(new Random().nextInt(1001));
                System.out.println("차량"+carName+"이 "+ (i * 100)+"m를 달렸습니다.");
            }
            System.out.println("차량 "+carName+"이 결승선을 통과했습니다!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
/*
스레드 경주 게임 시뮬레이션

    3대의 차량(스레드)이 경주를 합니다.
    각 차량은 출발 후 랜덤하게 0~1초 사이에 한 번씩 "차량 [번호]가 [거리m] 달렸습니다!" 메시지를 번 출력한 후, 경주를 마칩니다.

    출력 예시:
    차량 1이 출발했습니다.
    차량 2이 출발했습니다.
    차량 3이 출발했습니다.
    차량 3이 100m를 달렸습니다.
    차량 2이 100m를 달렸습니다.
    차량 1이 100m를 달렸습니다.
    차량 2이 200m를 달렸습니다.
    ...
    차량 3이 800m를 달렸습니다.
    차량 3이 900m를 달렸습니다.
    차량 3이 결승선을 통과했습니다!
    차량 2이 결승선을 통과했습니다!
 */