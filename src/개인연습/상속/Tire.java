package 개인연습.상속;

public abstract class Tire {

    String location;

    int maxRotation;

    int accumulatedRotation = 0;


    public boolean roll () {
        accumulatedRotation++;
        if (maxRotation > accumulatedRotation) {
            System.out.println(location + "쪽 타이어 펑크");
            return false;
        } else{
            System.out.println(location + "쪽 타이어 펑크");
            return false;
        }
    }

}
