package polymorphism.interface0.car.poly;

public class Sm5 implements Car{
    @Override
    public void onEngine() {
        System.out.println("Sm5");
    }

    @Override
    public void offEngine() {
        System.out.println("Sm5");
    }

    @Override
    public void pressAccel() {
        System.out.println("Sm5");
    }

    @Override
    public void pressBreak() {
        System.out.println("Sm5");
    }
}
