package 개인연습.상속;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        int lap = 10;
        for (int i = 0; i < lap; i++) {
            int changeTire = car.run();

            switch (changeTire) {
                case 1 :
                    System.out.println("앞 왼쪽 타이어 교체");
                    car.frontLeftTire = new HankookTire("앞 왼쪽");
                    break;
                case 2 :
                    System.out.println("앞 오른쪽 타이어 교체");
                    car.frontRightTire = new HankookTire("앞 오른쪽");
                    break;
                case 3 :
                    System.out.println("뒤 왼쪽 타이어 교체");
                    car.backLeftTire = new KumhoTire("뒤 왼쪽");
                    break;
                case 4 :
                    System.out.println("뒤 오른쪽 타이어 교체");
                    car.backRightTire = new KumhoTire("뒤 오른쪽");
                    break;
            }

        }
        System.out.println(lap + "바퀴 완주 하였습니다.");

    }
}
