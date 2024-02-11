package 개인연습;

import java.util.Scanner;

public class 개인연습8 {
    public static void main(String[] args) {
        //사용자로부터 월과 일을 입력받아, 해당 날짜가 몇 번째 날인지 출력하는 프로그램을 작성하세요. 예를 들어, 3월 1일은 1번째 날이며, 3월 2일은 2번째 날입니다.

        //힌트: 입력받은 월과 일에 따라 해당 월까지의 날짜 수를 더하고, 그에 입력받은 일을 더하여 몇 번째 날인지 계산할 수 있습니다.

        Scanner scanner = new Scanner(System.in);
        System.out.print("월 : ");
        int 월 = scanner.nextInt();
        System.out.print("일 : ");
        int 일 = scanner.nextInt();

        System.out.println(월 + "월 " + 일 + "일의 " + 일 + "번째 날 입니다." );
    }
}
