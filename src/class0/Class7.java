package class0;

public class Class7 {
    public static void main(String[] args) {
        // 라디오와 연관된 데이터를 라디오 객체로 묶음
        // 관련 데이터를 쉽게 구분 가능  * int i = 0 입력해도 라디오에는 아무 지장이 없음 불리됨
        Radio radio = new Radio(); // 라디오 객체 생성

        // 제사용이 가능한 기능들을 메소드로 추출하기
        turnOn(radio);
        volumeUp(radio);
        volumeDown(radio);
        showRadio(radio);
        turnOff(radio);

        // 모듈화
        // 코드 중복 줄이기
        // 같은 로직이 필요시 메서드 호출하면 됨
        // 기능이 수정될 때, 하나의 메서드에서 쉽게 수정 됨

    }
    // 라디오 켜기 메서드
    static void turnOn (Radio radio) {
        radio.isOn = true;
        System.out.println("라디오 전원을 켰습니다.");
    }
    // 음량 높이기
    static void volumeUp (Radio radio) {
        radio.volume++; // 만약 볼륨을 2씩 오르게 하고 싶으면 radio.volume = radio.volume + 2;
        System.out.println("라디오 음량 : " + radio.volume);
    }
    // 음량 줄이기
    static void volumeDown (Radio radio) {
        radio.volume--;
        System.out.println("라디오 음량 : " + radio.volume);
    }
    // 라디오 상태 확인
    static void showRadio (Radio radio) {
        System.out.println("라디오 상태 확인");
        if (radio.isOn == true) {
            System.out.println("라디오 전원 켜짐, 음량 : " + radio.volume);
        } else {
            System.out.println("라디오 전원 꺼짐");
        }
    }
    // 라디오 끄기
    static void turnOff (Radio radio) {
        radio.isOn = false;
        System.out.println("라디오를 종료 합니다.");
    }

}
