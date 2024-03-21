package thread.ex;

import java.util.Random;

public class Car extends Thread{
    int max;
    int carNumber;

    public Car(int max, int carNumber) {
        this.max = max;
        this.carNumber = carNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < max; i++) {

            for (int j = 0; j < carNumber; j++) {
                try {
                    Thread.sleep(new Random().nextInt(10,1000));
                    System.out.printf("차량 %s이 질주중!\n", (j+1));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        }



    }
}
