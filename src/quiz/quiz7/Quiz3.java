package quiz.quiz7;

import java.util.Random;

public class Quiz3 {
    public static void main(String[] args) {
        new Thread(new Car(1)).start();
        new Thread(new Car(2)).start();
        new Thread(new Car(3)).start();




    }
    static class Car implements Runnable{
        int num;

        public Car(int num) {
            this.num = num;
        }

        @Override
        public synchronized void run() {
            System.out.printf("차량 %s이 출발했습니다.\n", num);
            try {
                Thread.sleep((new Random().nextInt(10)*100 + 1));
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("차량 %s이 %sm를 달렸습니다.\n", num, i * 100);
                    if (i == 10) {
                        System.out.printf("차량 %s이 결승선을 통과했습니다!\n", num);

                    }

                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
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