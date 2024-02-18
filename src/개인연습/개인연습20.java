package 개인연습;

import java.util.Scanner;

public class 개인연습20 {
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
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("시작 정수 : ");
            int start = scanner.nextInt();
            System.out.println("끝 정수 : ");
            int end = scanner.nextInt();

            int totalScore = 0;

            while (start <= end) {
                if (start % 2 == 0) {
                    totalScore += start;
                    if (start != end+1) {
                        System.out.print(" + ");

                    }
                    System.out.print(start);

                }
                start ++;
            }
            System.out.println(" = " + totalScore);
        }
}
