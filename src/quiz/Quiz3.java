package quiz;

import java.util.Scanner;

public class Quiz3 {
    /*
    배열 :   점수를 입력받을 학생수를 입력받아 배열에 저장하고
 입력받은 수만큼 학생들의 점수를 입력받은 후, 합계와 평균을 출력해주세요
        /*
        예시
        학생수는 몇명인가요? 3
        점수를 입력하세요
        10
        20
        30
        >> 합계 : 60, 평균 : 20.0
         */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생수는 몇명인가요? : ");
        int studentNumber = scanner.nextInt();
        System.out.println("점수를 입력하세요. : ");
        int studentScore = scanner.nextInt();


    }


}
