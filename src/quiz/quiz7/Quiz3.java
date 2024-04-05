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
                for (int i = 0; i < 11; i++) {
                    System.out.printf("차량 %s이 %sm를 달렸습니다.\n", num, i * 100);
                    if (i > 11) {
                        System.out.printf("차량 %s이 결승선을 통과했습니다!\n", num);
                    }

                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
