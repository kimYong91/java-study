package condition;

public class Condition9 {
    public static void main(String[] args) {

        int time = 13;

        switch (time) {
            case 8:
                System.out.println("출근 시간이다.");
            case 9:
                System.out.println("입실 시간이다.");
            case 10:
                System.out.println("지각 이다.");
            case 13:
                System.out.println("점심 시간이다.");
            default:
                System.out.println("퇴근 시간이다.");

        }
    }
}
