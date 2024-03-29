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
            System.out.print("시작 정수 : ");
            int start = scanner.nextInt();
            System.out.print("끝 정수 : ");
            int end = scanner.nextInt();

            int totalScore = 0; //  합계를 구해야 하는 상황이라면 일단 무조건 0으로 시작할 바구니를 준비해야함

//            while (start <= end) {
//                if (start % 2 == 0) {
//                    totalScore += start;
//                    System.out.print(start); // 순서 중요
//                    if (start < end) {           // 숫자 다음에 +를 하기 위한 코드 end 보다 작을 때만 실행
//                        System.out.print(" + "); // 끝 숫자전까지만 +가 붙음  * (start != end) 이것도 가능
//                    }
//                }
//                start ++;
//            }

            for (int i = 0; i < end; i++) {
                start = i;
                if (start % 2 == 0) {
                    totalScore += start;
                    System.out.println(start);
                }

            }
            System.out.println(" = " + totalScore);
        }
}
