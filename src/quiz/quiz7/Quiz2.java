package quiz.quiz7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Quiz2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ArrayList<CoffeeOrder> coffeeOrders = new ArrayList<>(Arrays.asList(
                new CoffeeOrder("에스프레소", 2),
                new CoffeeOrder("아메리카노", 3),
                new CoffeeOrder("카푸치노", 5),
                new CoffeeOrder("라떼", 4)
        ));

        for (CoffeeOrder coffeeOrder : coffeeOrders) {
            executorService.execute(coffeeOrder);
        }

        executorService.shutdown();

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
/*
스레드풀 카페에서의 커피 주문 처리

    여러 손님들이 동시에 커피를 주문할 수 있으며, 각 커피를 만드는 데에는 일정 시간이 소요됩니다. 여러 손님의 주문을 효율적으로 처리하기 위해 스레드 풀(직원)을 사용하여 커피 주문을 병렬로 처리하는 시스템을 구현해야 합니다.

    요구사항:
    - 손님의 주문은 CoffeeOrder 태스크로 표현됩니다. 각 CoffeeOrder는 커피의 이름과 준비 시간(초 단위)을 가집니다.
    - 스레드 풀을 사용하여 여러 개의 CoffeeOrder를 동시에 처리합니다. 스레드 풀의 크기는 3으로 설정합니다.
    - 각 주문이이 처리될 때, 콘솔에는 주문받은 커피의 이름과 "준비 완료!"가 출력되어야 합니다

    입력데이터 예시:
            new CoffeeOrder("에스프레소", 2),
            new CoffeeOrder("아메리카노", 3),
            new CoffeeOrder("카푸치노", 5),
            new CoffeeOrder("라떼", 4),

    출력예시
    ===
    pool-1-thread-2> 아메리카노 준비 시작.
    pool-1-thread-3> 카푸치노 준비 시작.
    pool-1-thread-1> 에스프레소 준비 시작.
    pool-1-thread-1> 에스프레소 준비 완료!
    pool-1-thread-1> 라떼 준비 시작.
    pool-1-thread-2> 아메리카노 준비 완료!
    pool-1-thread-3> 카푸치노 준비 완료!
    pool-1-thread-1> 라떼 준비 완료!
 */