package condition;

public class Condition7 {
    public static void main(String[] args) {
        // 주사위 던지기
        int diceNumber = (int) ((Math.random() * 6) + 1); // 1~6까지 랜덤한 난수
        // 여기서 * 6은 미만을 정하는것으로 0~5까지(실수 포함) 나오라는 것이고, + 1은 최소치를 뜻한다.

        System.out.println("숫자 : " + diceNumber);

        if (diceNumber == 1) {
            System.out.println("주사위 1번입니다.");
        } else if (diceNumber == 2) {
            System.out.println("주사위 2번입니다.");
        } else if (diceNumber == 3) {
            System.out.println("주사위 3번입니다.");
        } else if (diceNumber == 4) {
            System.out.println("주사위 4번입니다.");
        } else if (diceNumber == 5) {
            System.out.println("주사위 5번입니다.");
        } else {
            System.out.println("주사위 6번입니다.");
        }
    }
}
