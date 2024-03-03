package 개인연습.상속;

public class Car {

    Tire frontLeftTire = new HankookTire("앞 왼쪽");
    Tire frontRightTire = new HankookTire("앞 오른쪽");
    Tire backLeftTire = new KumhoTire("뒤 왼쪽");
    Tire backRightTire = new KumhoTire("뒤 오른쪽");

    public int run() {
        System.out.println("자동차가 달립니다.");

        if (!frontLeftTire.roll()) {
            stop();
            return 1;
        }
        if (!frontRightTire.roll()) {
            stop();
            return 2;
        }
        if (!backLeftTire.roll()) {
            stop();
            return 3;
        }
        if (!backRightTire.roll()) {
            stop();
            return 4;
        }
        return 0;
    }

    public void stop() {
            System.out.println("타이어 펑크로 인하여 차량이 멈춤니다.");
        }

}
