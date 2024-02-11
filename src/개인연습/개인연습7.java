package 개인연습;

import java.util.Scanner;

public class 개인연습7 {
    public static void main(String[] args) {
       // 사용자로부터 1부터 7까지의 숫자를 입력받아, 해당하는 요일을 출력하는 프로그램을 작성하세요. (1은 월요일, 2는 화요일, ..., 7은 일요일입니다)
       // 힌트: switch 문을 사용하여 사용자가 입력한 숫자에 따라 각각의 요일을 출력합니다.

        Scanner scanner = new Scanner(System.in);
        System.out.print("num : ");
       // if (scanner.hasNextInt()) { // 입력값이 정수인지 확인합니다.
        int weather = scanner.nextInt();

        switch (weather) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            case 7:
                System.out.println("일요일");
                break;
            default:
                System.out.println("1-7 까지 입력");
        }
    } // else { // 정수가 아닌 값을 입력했을 때의 처리입니다.
      //  System.out.println("숫자를 입력하세요.");
}
