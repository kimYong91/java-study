package polymorphism.ex.ex1;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        for (int i = 0; i < 10; i++) {
            int problemLocation = car.run();
            // 타이어 펑크시 자동차 멈춤
//            if (problemLocation > 0) {
//                break;
//            }
            // 자동차 펑크 시 타이어 교체
            switch (problemLocation) {
                case 1 :
                    System.out.println("앞왼쪽 타이어 교체");
                    car.frontLeftTire = new HankookTire("앞외쪽", 10);
                case 2 :
                    System.out.println("앞오른쪽 타이어 교체");
                    car.frontLeftTire = new HankookTire("앞오른쪽", 10);
                case 3 :
                    System.out.println("뒤왼쪽 타이어 교체");
                    car.frontLeftTire = new HankookTire("뒤왼쪽", 10);
                case 4 :
                    System.out.println("뒤오른쪽 타이어 교체");
                    car.frontLeftTire = new HankookTire("뒤오른쪽", 10);
            }
        }

    }

}
