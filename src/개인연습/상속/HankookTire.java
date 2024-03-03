package 개인연습.상속;

public class HankookTire extends Tire {


    public HankookTire(String location) {
        this.location = location;
        maxRotation = (int)(Math.random()*8)+3;
    }

    @Override
    public boolean roll () {
        accumulatedRotation++;
        if (this.maxRotation > accumulatedRotation) {
            System.out.println(location + " 한국 타이어 정상, 수명 : " + (this.maxRotation - accumulatedRotation));
            return true;
        } else{
            System.out.println(location + " 한국 타이어 펑크");
            return false;
        }
    }

}
