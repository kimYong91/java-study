package 개인연습.상속;

public abstract class Tire {

    String location;

    int maxRotation;

    int accumulatedRotation = 0;


    public boolean roll () {

        if (maxRotation > accumulatedRotation) {
            return true;
        } else {
            return false;
        }
    }

}
