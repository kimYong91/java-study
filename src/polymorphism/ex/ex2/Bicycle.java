package polymorphism.ex.ex2;

public class Bicycle extends Transport{
    @Override
    public void move() {
        System.out.println("자전거가 길을 따라 pedaling 합니다.");
    }
}
