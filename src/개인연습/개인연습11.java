package 개인연습;

import java.util.Scanner;

public class 개인연습11 {
    public static void main(String[] args) {
        // 사용자로부터 입력받은 월에 해당하는 계절을 출력하는 프로그램을 만들어보세요.
        // 예를 들어, 3월은 봄, 6월은 여름, 9월은 가을, 12월은 겨울로 출력되어야 합니다.
        // 입력은 1부터 12까지의 정수로 받습니다.
        // 이 문제를 해결하기 위해 if 문과 switch 문을 사용해보세요!
        // 만약, 사용자가 1보다 작거나 12보다 큰 숫자를 입력하면 "올바른 월을 입력하세요."라는 메시지를 출력해야 합니다.

        Scanner scanner = new Scanner(System.in);
        System.out.print("월을 입협하세요. : ");
        int num = scanner.nextInt();

        if (num >= 1 && num <= 12 ) {

            switch (num) {
                case (1):
                    System.out.println("1월은 겨울 입니다.");
                    break;
                case (2):
                    System.out.println("2월은 겨울 입니다.");
                    break;
                case (3):
                    System.out.println("3월은 봄 입니다.");
                    break;
                case (4):
                    System.out.println("4월은 봄 입니다.");
                    break;
                case (5):
                    System.out.println("5월은 봄 입니다.");
                    break;
                case (6):
                    System.out.println("6월은 여름 입니다.");
                    break;
                case (7):
                    System.out.println("7월은 여룸 입니다.");
                    break;
                case (8):
                    System.out.println("8월은 여름 입니다.");
                    break;
                case (9):
                    System.out.println("9월은 가을 입니다.");
                    break;
                case (10):
                    System.out.println("10월은 가을 입니다.");
                    break;
                case (11):
                    System.out.println("11월은 가을 입니다.");
                    break;
                case (12):
                    System.out.println("12월은 겨울 입니다.");
                    break;
            }

        }
//        String error;
//        if (num <= 1 && num >= 12) {
//            num = error;
//        } System.out.println("해당하는 숫자만 기입해주세요");

    }
}
