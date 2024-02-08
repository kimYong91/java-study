package condition;

public class Condition10 {
    public static void main(String[] args) {
        int diceNumber = (int) ((Math.random() * 6) + 1); // 1~6까지 랜덤한 난수


        // switch 문은 조건식에 해당하는 특정 값으로 실행할 코드를 선택한다.
        // 조건식 결과값이 case의 값이 일치하면 case의 코드를 실행
        // break 문은 switch 문을 빠져나가게 된다.
        // break 문이 없으면 이후의 case 문의 코드가 차례대로 실행된다.
        switch (diceNumber) {
            case 1:
                System.out.println("1번 나왔습니다.");
                break;
            case 2:
                System.out.println("2번 나왔습니다.");
                break;
            case 3:
                System.out.println("3번 나왔습니다.");
                break;
            case 4:
                System.out.println("4번 나왔습니다.");
                break;
            case 5:
                System.out.println("5번 나왔습니다.");
                break;
            default:
                System.out.println("6번 나왔습니다.");
                break;
        }

    }
}