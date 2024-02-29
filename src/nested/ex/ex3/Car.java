package nested.ex.ex3;

public class Car {
    // 인스턴스 중첩 클래스
    class Tire{
        String tire;

        Tire (String tire) {
            this.tire = tire;
        }

        public void getTire() {
            System.out.println(tire);
        }
    }
    // 정적 중첩 클래스
    static class Engine{
        String engine;

        Engine(String engine){
            this.engine = engine;
        }
        public void getInstance() {
            System.out.println(engine);
        }
    }
}
