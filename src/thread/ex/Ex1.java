package thread.ex;

public class Ex1 {
    public static void main(String[] args) {

//        Thread car1 = new Thread((new CarRunnable("아반때")));
//        Thread car2 = new Thread((new CarRunnable("그랜져")));
//        Thread car3 = new Thread((new CarRunnable("소나타")));
//
//        car1.start();
//        car2.start();
//        car3.start();

        System.out.println("========================================================");

        Thread car = new Thread(new Car(3,3));
        car.start();
    }
}
/*
연습문제: 경주 게임 시뮬레이션
요구사항:

3대의 차량(스레드)이 경주를 합니다.
각 차량은 출발 후 랜덤하게 0~1초 사이에 한 번씩 "차량 [번호]가 질주중!" 메시지를 5번 출력한 후, 경주를 마칩니다.
출력 예시:

python
Copy code
차량 1이 질주중!
차량 2이 질주중!
차량 3이 질주중!
차량 1이 질주중!
차량 3이 질주중!
...
차량 3이 경주 마침!
차량 1이 경주 마침!
차량 2이 경주 마침!
 */