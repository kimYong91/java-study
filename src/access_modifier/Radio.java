package access_modifier;

public class Radio {
    // 필드
    private int volume;         // 요구사항 : 음랸이 10을 넘어서면 안됨, 고장남
        // private 으로 접근 제한자를 변경  * 클래스 내에서는 직접 접근 가능


    // public 을 한다면 외부에서도 조작이 가능하기에, 사용자들이 사용하는, 사용해야하는 것들은 public 을 붙이자
    public void volumeUp() {
        if (volume >= 10) {
            System.out.println("더이상 음량을 증가할 수 없습니다.");
            return;  // if문에 충족되면 같은 메서드의 다른 코드는 사용안됨
        }
        volume++;
        System.out.println("볼륨을 증가 합니다.");
    }

     public void volumeDown() {
        volume--;
        System.out.println("볼륨을 감소 합니다.");
    }

     public void printVolume() {
        System.out.println("현재 볼륨 : " + this.volume);
    }
}
