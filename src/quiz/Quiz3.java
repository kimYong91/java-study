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
        System.out.print("학생 수는 몇 명인가요? ");
        int studentNumber = scanner.nextInt();
        System.out.println("점수를 입력해 주세요");

        int[] studentScores = new int[studentNumber];
        int totalScores = 0;

        for (int i = 0; i < studentNumber; i++) {
            studentScores[i] = scanner.nextInt();
            totalScores += studentScores[i];
        }
        double averageScore = (double)totalScores / studentNumber;
        System.out.println(">> 합계 : " + totalScores + ", 평균 : " + averageScore);
    }
}

