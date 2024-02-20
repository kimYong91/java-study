package access_modifier;

public class Access2 {
    public static void main(String[] args) {
        Car car = new Car();



        System.out.println(car.getSpeed());


        //현재 속도를 설정한다.
        car.setSpeed(119);
        car.speedUp();      // 120
        car.speedUp();      // 제약사항
        //현재 속도를 가져온다.
        int currentSpeed = car.getSpeed();
        System.out.println(car.getSpeed());
        System.out.println(currentSpeed);
    }
}
