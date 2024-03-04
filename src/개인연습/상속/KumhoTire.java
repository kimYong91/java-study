package 개인연습.상속;

public class KumhoTire extends Tire{


    public KumhoTire(String location) {
        this.location = location;
        maxRotation = (int)(Math.random()*8)+3;
    }

    @Override
    public boolean roll () {

        if (this.maxRotation > accumulatedRotation) {
            System.out.println(location + " 금호 타이어 정상, 수명 : " + (this.maxRotation - accumulatedRotation));
            accumulatedRotation++;
            return true;
        } else{
            System.out.println(location + " 금호 타이어 펑크");
            return false;
        }
    }

}
