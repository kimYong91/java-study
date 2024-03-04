package exception.예외_활용법;

public class WrongMonthMain {
    public static void main(String[] args) {
        try {       // try문을 사용시 throw와 달리 실행시에 붉은 색으로 애러 표시 나지 않는다.
            serMonth(5);
            serMonth(10);
            serMonth(13);
        } catch (WrongMonthException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void serMonth(int month) {
        if (month < 1 || month > 12) {
             new WrongMonthException(month);
            // 예외가 발생하면 아래 코드는 수행되지 않습니다.
        }
        System.out.println(month + "월로 설정되었습니다.");
    }
}
