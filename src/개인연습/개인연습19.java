package 개인연습;

import 개인연습.ProductOrder;

import java.util.Scanner;

public class 개인연습19 {
    public static void main(String[] args) {
         /*
    반복문 : 짝수의 합 구하기
    사용자로부터 두 정수 start 와 end 를 입력받아,
    start 와 end 사이의 모든 짝수의 합을 계산하는 프로그램을 작성하세요
    */
    /*
    출력예시
    ======
    시작 정수: 4
    끝 정수: 15
    4 + 6 + 8 + 10 + 12 + 14 = 54
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========");
        System.out.print("시작 정수 : ");
        int start = scanner.nextInt();
        System.out.print("끝 정수 : ");
        int end = scanner.nextInt();

        int sum = 0;

        while (start <= end) {
            if (start % 2 == 0) {
                sum += start;
                System.out.print(start);
                if (start != end)
                    System.out.print(" + ");

            }
            start++;
        }
        System.out.println();
        System.out.println("합계 : " + sum);

    }


}
