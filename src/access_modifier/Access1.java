package access_modifier;

public class Access1 {
    public static void main(String[] args) {
         /* 접근제한자 access_modifier
        클래스를 외부에서 메서드, 필드 등에 접근하는 것을 허용하거나 제한하는 제한자
        public > protected > default > private (접근범위 순 ; 왼쪽부터)
         */

        Radio radio = new Radio();
        // radio.volume = 9;       // <- 이곳(객체의 데이터)에 직접적으로 건든다면 제약사한은 아무 의미 없음
        // private 으로 변경 시 외부에서 데이터에 직접 접근이 불가


        radio.volumeUp();           // 10
        radio.volumeDown();         // 제약사항
        radio.printVolume();        // 10

    }
}
