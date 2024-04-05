package quiz.quiz7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Quiz2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List arrayList = new ArrayList<>(Arrays.asList(
                new CoffeeOrder("에스프레소", 2),
                new CoffeeOrder("아메리카노", 3),
                new CoffeeOrder("카푸치노", 5),
                new CoffeeOrder("라떼", 4)
        ));

    }
    static class CoffeeOrder implements Runnable{
        String coffee;
        int time;

        public CoffeeOrder(String coffee, int time) {
            this.coffee = coffee;
            this.time = time;
        }

        @Override
        public void run() {
            System.out.println(coffee + "준비 시작.");

            try {
                Thread.sleep(time*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(coffee + "준비 완료!");
        }
    }
}
